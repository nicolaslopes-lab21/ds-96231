package com.example.atividade1;

public class Endereco {
    private String lograudouro;
    private String numero;
    private String cidade;

    public Endereco(String lograudouro, String numero, String cidade) {
        this.lograudouro = lograudouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLograudouro() {
        return lograudouro;
    }

    public void setLograudouro(String lograudouro) {
        this.lograudouro = lograudouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
