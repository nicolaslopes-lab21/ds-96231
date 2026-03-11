package org.example.atv3;

public class Memoria extends Aparelhos{
    private String capacidadeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
