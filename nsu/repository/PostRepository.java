package nsu.repository;

import nsu.domain.Post;
import java.util.*;

public class PostRepository {
    private final Map<Long, Post> map = new HashMap<>();

    public void save(Post post) {
        map.put(post.getId(), post); // post 객체를 map에 저장
    }

    public List<Post> findAll() {
        return new ArrayList<>(map.values()); // 저장된 모든 게시글을 리스트로 반환
    }

    public Post findById(Long id) {
        return map.get(id); // 주어진 id에 해당하는 게시글 출력
    }

    public void deleteById(Long id) {
        map.remove(id); // 주어진 id의 게시글 삭제
    }
}
