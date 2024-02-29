package com.example.demo.domain.controllers;


import com.example.demo.domain.dto.usuario.AtualizarUsuariosDTO;
import com.example.demo.domain.dto.usuario.ListarUsuariosDTO;
import com.example.demo.domain.dto.usuario.RegistroUsuariosDTO;
import com.example.demo.domain.entities.Post;
import com.example.demo.domain.entities.User;
import com.example.demo.domain.services.PostService;
import com.example.demo.domain.services.UserService;
import com.example.demo.domain.util.URL;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/{id}")
    public ResponseEntity listarPostsPorId(@PathVariable String id) {
        Post post = service.findPostById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> procurarPostsPorId(@RequestParam(value = "text") String text) {
        text = URL.decodificarURL(text);
        List<Post> list = service.findByTitulo(text);
        return ResponseEntity.ok().body(list);
    }

}
