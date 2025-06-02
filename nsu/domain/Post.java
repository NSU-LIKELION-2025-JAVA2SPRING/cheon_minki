package nsu.domain;

import nsu.IdGenerator;

public class Post {
    private Long id;
    private String title;

    public Post(String title) {
        this.id = IdGenerator.generateId();
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
