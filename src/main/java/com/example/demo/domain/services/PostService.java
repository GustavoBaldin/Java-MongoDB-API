package com.example.demo.domain.services;

import com.example.demo.domain.entities.Post;
import com.example.demo.domain.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findPostById(String id) {
        return repository.findPostById(id);
    }

    public List<Post> findByTitulo(String text) {
        return repository.findByTituloQuery(text);
    }
}
