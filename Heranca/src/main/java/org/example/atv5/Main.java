package org.example.atv5;

public class Main {
    public static void main(String[] args) {
       Engenheiro engenheiro = new Engenheiro("nicolas","nicolas@gmail.com",333, new Endereco("33","33","praca","3333","candeias"), "333");
       Medico medico = new Medico("nicolas","nicolas@gmail.com",32123, new Endereco("oii","23","praca","323221","candeias" ), "3221");


        System.out.println(medico);
        System.out.println(engenheiro);
    }
}
