package org.example.atv4;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Beneficiario beneficiario) {
        super(nome, cpf, dataNascimento, salarioBase, beneficiario);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando:" + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando;" + funcionario.getNome() );

    }

    @Override
    public double obterSalarioFinal() {
        return Beneficiario.GERENTE.getValor() * super.salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "beneficiario=" + beneficiario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }
}
