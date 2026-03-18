package org.example.ex2;

public enum Setor {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
