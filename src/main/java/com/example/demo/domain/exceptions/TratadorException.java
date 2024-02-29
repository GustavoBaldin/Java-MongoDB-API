package com.example.demo.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class TratadorException {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity erro404() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro 404: Elemento não encontrado");
    }



}
