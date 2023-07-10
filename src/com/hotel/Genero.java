package com.hotel;

public enum Genero {
    MASULINO("M"), FEMININO("F");

    String codigo;

    Genero(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
