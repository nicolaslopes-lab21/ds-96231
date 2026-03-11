package org.example.atv4;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Nicolas", "71986287373", "19298289892", "281772", "192837");
        Juridica juridica = new Juridica("Nicolas", "71992929292", "19289289", "online");

        System.out.println(fisica);
        System.out.println(juridica);
    }
}
