package org.example.atv5;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Nicolas","07473782","33333",Sexo.MASCULINO,33333);
        Gerente gerente = new Gerente("Nicolas","2763636","33333",Sexo.MASCULINO,3333,"28032007","28282", Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Nicolas","37377373","23321",Sexo.MASCULINO,3212,"12/2","1234/2",Bonificacao.DIRETOR);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        diretor.admitir(motoboy);
        diretor.demitir(gerente);

    }
}
