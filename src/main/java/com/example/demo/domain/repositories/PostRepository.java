package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Post;
import com.example.demo.domain.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    Post findPostById(String id);

    @Query("{ 'titulo': { $regex: ?0, $options: 'i' } }")
    List<Post> findByTituloQuery(String title);
}
