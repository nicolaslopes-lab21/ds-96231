package org.example.atv4;

public enum Beneficiario {
    GERENTE(1.3),
    DIRETOR(1.4);

    private double valor;

    Beneficiario(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
