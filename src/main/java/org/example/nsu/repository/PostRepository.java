package org.example.nsu.repository;

import org.example.nsu.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

//    // 키워드 검색
//    List<Post> findAllByTitle(String title);

}
