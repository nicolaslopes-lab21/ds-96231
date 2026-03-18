package org.example.ex2;

public enum Sexo {
    RECURSOS_humanos("Recursos humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacoes");

    private String nome;

    Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
