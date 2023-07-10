package com.hotel;

public class Funcionario extends Pessoa {
    private Cargo funcao;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, String sexo, Endereco endereco, Telefone telefone, String email, Cargo funcao, double salario) {
        super(nome, idade, sexo, endereco, telefone, email);
        this.funcao = funcao;
        this.salario = salario;

    }

    public Cargo getFuncao() {
        return funcao;
    }

    public void setFuncao(Cargo funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
