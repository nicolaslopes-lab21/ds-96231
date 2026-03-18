package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("nicolas","28032077", Sexo.MASCULINO, Setor.FINANCEIRO,2222, "fhgfh");
        Diretor diretor = new Diretor("Nicolas","28032007",Sexo.MASCULINO, Setor.FINANCEIRO,2222);

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());


    }
}
