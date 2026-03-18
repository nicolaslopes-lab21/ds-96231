package org.example.atv3;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String nome;

    Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
