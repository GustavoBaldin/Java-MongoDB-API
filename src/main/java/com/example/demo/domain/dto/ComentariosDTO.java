package com.example.demo.domain.dto;

import com.example.demo.domain.dto.usuario.AuthorDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComentariosDTO {

    private String texto;
    private Date data;
    private AuthorDTO autor;


}

