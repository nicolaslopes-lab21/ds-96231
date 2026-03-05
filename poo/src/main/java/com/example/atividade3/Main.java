package com.example.atividade3;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("3","Nicolas","rua da esp","71986289234","nicolas@gmail",
                new ContaBancaria("inter","321","33333","corrente","635","5000"));

        System.out.println("codigoFuncionario:" + funcionario1.getCodigoFuncionario());
        System.out.println("nome:" + funcionario1.getNome());
        System.out.println("endereco:" + funcionario1.getEndereco());
        System.out.println("telefone:" + funcionario1.getTelefone());
        System.out.println("codigoFuncionario:" + funcionario1.getCodigoFuncionario());
        System.out.println("codigoFuncionario:" + funcionario1.getCodigoFuncionario());

    }
}
