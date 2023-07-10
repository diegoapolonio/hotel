package com.hotel;

public class Hospede extends Pessoa {

    public Hospede() {

    }

    public Hospede(String nome, int idade, String sexo, Endereco endereco, Telefone telefone, String email) {
        super(nome, idade, sexo, endereco, telefone, email);
    }
}
