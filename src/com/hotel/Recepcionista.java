package com.hotel;

public class Recepcionista extends Funcionario {

    public Recepcionista() {

    }

    public Recepcionista(String nome, int idade, String sexo, Endereco endereco, Telefone telefone, String email, String funcao, double salario) {
        super(nome, idade, sexo, endereco, telefone, email, Cargo.RECEPCIONISTA, salario);
    }
}
