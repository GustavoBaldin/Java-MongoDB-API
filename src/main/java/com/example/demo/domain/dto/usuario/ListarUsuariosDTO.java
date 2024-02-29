package com.example.demo.domain.dto.usuario;

import com.example.demo.domain.entities.User;

import java.util.List;

public record ListarUsuariosDTO(
        String nome,
        String email

) {


    public ListarUsuariosDTO(User user) {
        this(user.getName(), user.getEmail());
    }
}
