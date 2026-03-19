package org.example.atv5;

public class Motoboy extends Funcionario{
    private String placadaMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placadaMoto) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placadaMoto = placadaMoto;
    }

    public String getPlacadaMoto() {
        return placadaMoto;
    }

    public void setPlacadaMoto(String placadaMoto) {
        this.placadaMoto = placadaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadaMoto='" + placadaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salarioFinal='" + this.getSalarioFinal() + '\'' +
                '}';
    }
    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
