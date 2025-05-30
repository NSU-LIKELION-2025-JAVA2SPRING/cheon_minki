package nsu.controller;

import nsu.domain.Post;
import nsu.exception.DuplicateTitleException;
import nsu.repository.PostRepository;
import nsu.service.PostService;
import java.util.List;

public class PostController {
    private final PostService postService;

    public PostController() {
        PostRepository repository = new PostRepository();  // 하나의 저장소를 생성
        this.postService = new PostService(repository);     // 서비스에 주입
    }

    public void createPost(String title) throws DuplicateTitleException {
        postService.createPost(title);
    }

    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    public Post getPostById(Long id) {
        return postService.getPostById(id);
    }

    public void updatePost(Long id, String title) {
        postService.updatePost(id, title);
    }

    public void deletePost(Long id) {
        postService.deletePost(id);
    }
}
