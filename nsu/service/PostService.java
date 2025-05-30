package nsu.service;

import nsu.domain.Post;
import nsu.repository.PostRepository;
import java.util.List;

public class PostService {
    private final PostRepository postRepository;
    private Long nextId = 1L;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(String title) {

        Post post = new Post(nextId++, title);

        if (title.length() > 30) { // 게시물이 30자 초과면 실행
            System.out.println("게시물 제목 30자가 초과되었습니다.");
        } else if (title == null || title.isBlank()) { // 값이 없거나 비었으면 실행
            System.out.println("게시물 제목이 없거나 비어있습니다."); 
        } else if (post.getTitle().equals(title)) { // 게시물이 중복이면 실행
            System.out.println("게시물이 제목이 중복입니다.");
        } else {
            postRepository.save(post); // 문제가 없을경우 게시물 저장 
        }
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id);
    }

    public void updatePost(Long id, String title) {
        Post post = postRepository.findById(id);
        if (post != null && title != null && !title.isBlank()) {
            post.setTitle(title);
            postRepository.save(post);
        }
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
