package com.hotel;

public class Gerente extends Funcionario {

    public Gerente() {

    }

    public Gerente(String nome, int idade, String sexo, Endereco endereco, Telefone telefone, String email, String funcao, double salario) {
        super(nome, idade, sexo, endereco, telefone, email, Cargo.GERENTE, salario);
    }
}
