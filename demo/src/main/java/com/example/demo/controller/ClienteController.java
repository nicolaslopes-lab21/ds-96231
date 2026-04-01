package com.example.demo.controller;

import com.example.demo.models.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteModel> listar() {
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel clienteModel) {
        repository.save(clienteModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteModel);
    }
}




