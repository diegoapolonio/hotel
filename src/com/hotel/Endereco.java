package com.hotel;

public class Endereco {
    private String rua;
    private int numero;
    private String pontoDeReferencia;

   public Endereco(){

    }
    public Endereco(String rua,int numero,String pontoDeReferencia){
       this.rua = rua;
       this.numero = numero;
       this.pontoDeReferencia = pontoDeReferencia;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }
}

