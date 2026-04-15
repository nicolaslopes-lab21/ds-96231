package com.example.aula.controller;

import com.example.aula.model.FuncionarioModel;
import com.example.aula.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel> listarFuncionario(){
        return service.listartodos();
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody FuncionarioModel funcionario) {
        service.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Funcionario salvo com sucesso."));
    }
    @PutMapping("{/id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @RequestBody FuncionarioModel funcionario) {
        service.atualizarFuncionario(id, funcionario);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "funcionario atualizado com sucesso"));


    }
}
