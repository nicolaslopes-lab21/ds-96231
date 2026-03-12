package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao1 = new Divisao();

        System.out.println("Soma: " + soma.calcular(2,3));
    }
}
