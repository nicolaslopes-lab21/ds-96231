package org.example.ex1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nicolas",42,"03/11/2026","pix");
        Funcionario funcionario = new Funcionario("Nicolas",42,"bbd","funcionario","3333");

        System.out.println(cliente);
        System.out.println(funcionario);

    }
}