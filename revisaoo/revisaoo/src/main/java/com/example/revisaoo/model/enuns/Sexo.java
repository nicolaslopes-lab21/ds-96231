package com.example.revisaoo.model.enuns;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String nome;

    Sexo(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
