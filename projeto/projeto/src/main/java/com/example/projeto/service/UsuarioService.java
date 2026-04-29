package com.example.projeto.service;

import com.example.projeto.model.UsuarioModel;
import com.example.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    public List<UsuarioModel> listarTodos() {
        return repository.findAll().stream().map()
    }
    public UsuarioModel salvarUsuario(UsuarioModel usuario) {
        if (repository.findbyEmail(usuario.getEmail()).isPresent() {
            throw new RuntimeException("Usuario já cadastrado.");
        }
        return repository.save(usuario);
    }
}
