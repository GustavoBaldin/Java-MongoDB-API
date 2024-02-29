package com.example.demo.domain.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegistroUsuariosDTO(@NotNull String name,

                                  @NotNull String email) {
}
