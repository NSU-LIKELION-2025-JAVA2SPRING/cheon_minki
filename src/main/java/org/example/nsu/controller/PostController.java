package org.example.nsu.controller;

import org.example.nsu.domain.Post;
import nsu.exception.DuplicateTitleException;
import org.example.nsu.repository.PostRepository;
import org.example.nsu.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService PostService) {
        this.postService = PostService;     // 서비스에 주입
    }

    @PostMapping("/posts")
    public ResponseEntity<Void> createPost(@RequestHeader String title) {
        postService.createPost(title);

        return ResponseEntity.ok().build(); // ok = 200
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<String> getPostById(@PathVariable Long id) {
//        return ResponseEntity.ok(postService.getPostById(id));

        return ResponseEntity.ok(id.toString());
    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<Void> updatePost(@PathVariable Long id, @RequestBody String title)  {
        postService.updatePost(id, title);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.deletePost(id);

        return ResponseEntity.noContent().build(); // 204
    }
}
