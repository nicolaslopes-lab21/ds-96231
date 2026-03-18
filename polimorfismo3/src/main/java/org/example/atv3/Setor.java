package org.example.atv3;

public enum Setor {
    RECURSOS_HUMANOS("Recuros humanos"),
    FINANCEIRO("Financeiros"),
    OPERACOES("Operacoes");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
