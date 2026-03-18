package org.example.atv4;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("nicolas","38282","28032007",2333,"2sddwe");
        Gerente gerente = new Gerente("nicolas","828282","282822",23333, Beneficiario.GERENTE);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.demitir(motoboy);
    }
}
