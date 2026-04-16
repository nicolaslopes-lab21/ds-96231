package com.example.revisaoo.model.enuns;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
