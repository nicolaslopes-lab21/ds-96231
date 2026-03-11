package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("bmw","bmw","3333");
        PlacaMae placaMae = new PlacaMae("bmw","bmw","662");
        Memoria memoria = new Memoria("bmw","bmw","23332");
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento("bmw","bmw","33333","wifi");

        System.out.println(processador);
        System.out.println(placaMae);
        System.out.println(memoria);
        System.out.println(dispositivoDeArmazenamento);
    }
}
