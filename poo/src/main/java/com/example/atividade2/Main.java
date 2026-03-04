package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lua","3","pitbull");
        Cliente cliente1 = new Cliente("Nicolas",19, pet1);

        System.out.println("nome:" + cliente1.getNome());
        System.out.println("idade:" + cliente1.getNome());
        System.out.println();
        System.out.println("nome:" + cliente1.getPet().getNome());
        System.out.println("idade:" + cliente1.getPet().getIdade());
        System.out.println("raca:" + cliente1.getPet().getRaca());
    }
}
