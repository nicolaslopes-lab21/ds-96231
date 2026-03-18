package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("nicolas","28032077", Sexo.FINANCEIRO, Setor.FEMININO,22222);
        Diretor diretor = new Diretor("Nicolas","28032007", Sexo.FINANCEIRO, Setor.FEMININO,2222);

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());


    }
}
