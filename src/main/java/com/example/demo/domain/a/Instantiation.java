//package com.example.demo.domain.a;

import com.example.demo.domain.dto.ComentariosDTO;
import com.example.demo.domain.dto.usuario.AuthorDTO;
import com.example.demo.domain.entities.Post;
import com.example.demo.domain.entities.User;
import com.example.demo.domain.repositories.PostRepository;
import com.example.demo.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

//@Configuration
//public class Instantiation implements CommandLineRunner {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @Override
//    public void run(String... arg0) throws Exception {
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
//
//        List<Post> posts = new ArrayList<>();
//
//
//
//        User user1 = new User(null, "Maria Teresinha Augusta", "mariateresinhaaugusta@gmail.com", posts);
//        User user2 = new User(null, "Pedro Albuquerque", "pedroalbuquerque@gmail.com", posts);
//        User user3 = new User(null, "João Cavacelli", "joaocavacelli@gmail.com", posts);
//
//
//        ComentariosDTO c1 = new ComentariosDTO("Boa viagem", sdf.parse("23/05/2018"), new AuthorDTO(user2));
//        ComentariosDTO c2 = new ComentariosDTO("Aproveite!", sdf.parse("24/05/2018"), new AuthorDTO(user3));
//        ComentariosDTO c3 = new ComentariosDTO("Tenha um ótimo dia", sdf.parse("19/09/2018"), new AuthorDTO(user1));
//
//        List<ComentariosDTO> listVazia = new ArrayList<>();
//
//        Post post1 = new Post(null, "Férias com EX", sdf.parse("23/05/2018"), "Estou de férias com o ex que me guampou mas eu amo ele", new AuthorDTO(user1), listVazia);
//        Post post2 = new Post(null, "Surfando na praia", sdf.parse("04/01/2018"), "Essa praia tá muito gostosa", new AuthorDTO(user2), listVazia);
//        Post post3 = new Post(null, "Setembro Amarelo, mas de verdade", sdf.parse("15/09/2018"), "Quantos de vocês conhecem pessoas que realmente acreditam no Setembro Amarelo?", new AuthorDTO(user2), listVazia);
//
//
//        user1.setPosts(Arrays.asList(post1, post2));
//        user2.setPosts(Arrays.asList(post3));
//
//        post1.setComentarios(Arrays.asList(c1, c2));
//        post2.setComentarios(Arrays.asList(c3));
//
//        postRepository.saveAll(Arrays.asList(post1, post2));
//
//
//
//
//    }
//}
