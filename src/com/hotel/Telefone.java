package com.hotel;

public class Telefone {
    private int ddd;
    private String telefone;
    private String telefoneAdicional;

    public Telefone(){

    }
    public Telefone(int ddd,String telefone,String telefoneAdicional){
        this.ddd = ddd;
        this.telefone = telefone;
        this.telefoneAdicional = telefoneAdicional;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneAdicional() {
        return telefoneAdicional;
    }

    public void setTelefoneAdicional(String telefoneAdicional) {
        this.telefoneAdicional = telefoneAdicional;
    }
}
