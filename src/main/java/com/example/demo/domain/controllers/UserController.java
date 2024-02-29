package com.example.demo.domain.controllers;


import com.example.demo.domain.dto.usuario.AtualizarUsuariosDTO;
import com.example.demo.domain.dto.usuario.ListarUsuariosDTO;
import com.example.demo.domain.dto.usuario.RegistroUsuariosDTO;
import com.example.demo.domain.entities.User;
import com.example.demo.domain.services.PostService;
import com.example.demo.domain.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity listarUsuarios() {
        var users = service.listarUsuarios().stream().map(ListarUsuariosDTO::new);

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity listarUsuarioPorId(@PathVariable String id) {
        var user = service.listarUsuarioPorId(id);

        return ResponseEntity.ok(new ListarUsuariosDTO(user));
    }

    @PostMapping
    @Transactional
    public ResponseEntity criarUsuario(@RequestBody @Valid RegistroUsuariosDTO registro, UriComponentsBuilder uriComponentsBuilder) {
        User usuario = new User(registro);
        service.criarUsuario(usuario);
        var uri = uriComponentsBuilder.path("/users/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new ListarUsuariosDTO(usuario));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletarUsuarioPorId(@PathVariable String id) {
        service.deletarUsuarioPorId(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity atualizarUsuario(@RequestBody @Valid AtualizarUsuariosDTO dto, @PathVariable String id) {
        User usuario = service.listarUsuarioPorId(id);
        usuario.atualizarInformacoes(dto);
        service.atualizarUsuario(usuario);

        return ResponseEntity.ok(new ListarUsuariosDTO(usuario));
    }

    @GetMapping("posts/{id}")
    public ResponseEntity listarPostsPorUsuarioId(@PathVariable String id) {
        User user = service.listarUsuarioPorId(id);
        return ResponseEntity.ok(user.getPosts());
    }

}
