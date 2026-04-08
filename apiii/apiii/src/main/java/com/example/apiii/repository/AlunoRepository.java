package com.example.apiii.repository;

import com.example.apiii.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}

