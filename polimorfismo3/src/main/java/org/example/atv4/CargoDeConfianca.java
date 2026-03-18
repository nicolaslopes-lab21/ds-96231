package org.example.atv4;

public abstract class CargoDeConfianca extends Funcionario  {
    protected Beneficiario beneficiario;

    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase, Beneficiario beneficiario) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.beneficiario = beneficiario;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }
}
