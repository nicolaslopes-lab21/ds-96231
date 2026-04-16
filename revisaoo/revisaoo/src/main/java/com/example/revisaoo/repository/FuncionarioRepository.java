package com.example.revisaoo.repository;

import com.example.revisaoo.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    //consultar no banco de dados se o email ja existe.
    //antes de salvar um cliente
    Optional<FuncionarioModel> findByEmail(String email);
}
