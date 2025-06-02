package org.example.nsu.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import nsu.IdGenerator;

// DB랑 연결되게 할 것
@Entity 
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id값으로 설정
    private Long id;
    private String title;

    public Post() {

    }

    public Post(String title){
        this.title = title;
    }

    public void updateTitle(String newtitle) {
        this.title = newtitle;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
}
