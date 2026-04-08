package com.example.apiii.controller;

import com.example.apiii.model.AlunoModel;
import com.example.apiii.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<AlunoModel> listatodos() {
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<AlunoModel> salvar(@RequestBody AlunoModel aluno) {
        repository.save(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }
}
