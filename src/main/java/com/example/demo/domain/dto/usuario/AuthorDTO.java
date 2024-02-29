package com.example.demo.domain.dto.usuario;

import com.example.demo.domain.entities.User;

public record AuthorDTO(String id,
                        String name,
                        String email) {

    public AuthorDTO(User user) {
        this(user.getId(), user.getName(), user.getEmail());
    }
}
