package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR A CLASSE PROFESSOR.
        Professor professor1 = new Professor("Marta","Logica de programacao");
        Professor professor2 = new Professor("Nicolas","Desenvolvimento de sistemas");


        System.out.println("Nome:" + professor1.getNome());
        System.out.println("Disciplina: " + professor1.getNome());
        System.out.println();
        System.out.println("Nome:" + professor2.getNome());
        System.out.println("Disciplina" + professor2.getNome());
    }
}
