package com.example.demo.domain.entities;

import com.example.demo.domain.dto.usuario.AtualizarUsuariosDTO;
import com.example.demo.domain.dto.usuario.RegistroUsuariosDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;

    @DBRef(lazy = true)
    private List<Post> posts;


    public User(RegistroUsuariosDTO dto) {
        this.name = dto.name();
        this.email = dto.email();
    }

    public void atualizarInformacoes(AtualizarUsuariosDTO dto) {
        this.name = dto.name();
        this.email = dto.email();
    }
}
