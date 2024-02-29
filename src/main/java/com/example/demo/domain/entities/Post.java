package com.example.demo.domain.entities;


import com.example.demo.domain.dto.ComentariosDTO;
import com.example.demo.domain.dto.usuario.AuthorDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Document
public class Post {

    @Id
    private String id;
    private String titulo;
    private Date data;
    private String corpo;
    private AuthorDTO usuario;

    private List<ComentariosDTO> comentarios = new ArrayList<>();

}
