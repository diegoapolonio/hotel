package com.hotel;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String sexo, Endereco endereco, Telefone telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new RuntimeException(" OPS!!! IDADE NÃO PERITIDA!");

        }
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("<Sexo Masculino>");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("<Sexo Feminino>");
        } else {

            throw new RuntimeException("OPS! SEXO INVALIDO!");
        }
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
