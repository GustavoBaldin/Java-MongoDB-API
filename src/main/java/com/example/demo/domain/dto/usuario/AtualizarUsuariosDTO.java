package com.example.demo.domain.dto.usuario;

import jakarta.validation.constraints.NotNull;

public record AtualizarUsuariosDTO(
        @NotNull String name,
        @NotNull String email

) {
}
