package org.example.nsu.service;

import org.example.nsu.domain.Post;
import nsu.exception.DuplicateTitleException;
import org.example.nsu.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(String title) {

        Post post = new Post(title);

        postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        Optional<Post> byId = postRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        throw new IllegalArgumentException("Exception");
    }

    public void updatePost(Long id, String title)  {
        Optional<Post> byId = postRepository.findById(id);
        if (byId.isPresent()) {
            Post post = byId.get();
            post.updateTitle(title);

            postRepository.save(post);
        }
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
