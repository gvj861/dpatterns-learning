package com.example.springboot.repo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
    private String name;

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
