package nsu.repository;

import nsu.domain.Post;
import java.util.*;

public class PostRepository {
    private final Map<Long, Post> map = new HashMap<>();

    public void save(Post post) {
        map.put(post.getId(), post);
    }

    public List<Post> findAll() {
        return new ArrayList<>(map.values());
    }

    public Post findById(Long id) {
        return map.get(id);
    }

    public void deleteById(Long id) {
        map.remove(id);
    }
}
