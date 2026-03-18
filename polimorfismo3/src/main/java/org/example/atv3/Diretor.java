package org.example.atv3;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioBase() {
        double salariofinal = super.salarioBase;
        salariofinal += super.salarioBase * this.PREMIO;
        return salariofinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando" + funcionario.getNome());

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
