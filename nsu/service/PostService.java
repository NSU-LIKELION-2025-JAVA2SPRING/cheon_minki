package nsu.service;

import nsu.domain.Post;
import nsu.repository.PostRepository;

import java.util.List;

public class PostService {


    public void createPost(String title) {
        createPost(title);
    }

    public List<Post> getAllPosts() {
        return getAllPosts();
    }

    public Post getPostById(Long id) {
        return getPostById(id);
    }

    public void updatePost(Long id, String title) {
        updatePost(id, title);
    }

    public void deletePost(Long id) {
        deletePost(id);
    }
}
