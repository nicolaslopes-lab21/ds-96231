package org.example.att2;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("bmw","ferrari","33");
        Memoria memoria = new Memoria("celta","bmw","100000");

        System.out.println(processador);
        System.out.println(memoria);
    }
}
