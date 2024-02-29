package com.example.demo.domain.services;

import com.example.demo.domain.entities.User;
import com.example.demo.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listarUsuarios() {
        List<User> users = repository.findAll();
        return users;
    }

    public User listarUsuarioPorId(String id) {
        return repository.getReferenceById(id);
    }

    public void criarUsuario(User usuario) {
        repository.save(usuario);
    }

    public void deletarUsuarioPorId(String id) {
        repository.deleteById(id);
    }

    public void atualizarUsuario(User user) {
        repository.save(user);
    }
}
