package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(33,"Nicolas","7198646362",
                "nicolas@gmail",Sexo.MASCULINO,
                new Endereco("rua b","33","em frente a voanet","1298","candeias",
                        Unidadefederativa.BAHIA));

        System.out.println(pessoa1.toString());
    }
}
