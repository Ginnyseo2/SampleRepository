package com.example.demo.dto;

import com.example.demo.entity.User;

public class UserResponse {
    private Long id;
    private String name;
    private String email;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    // Getter
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
