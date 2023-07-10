package com.hotel;

public class Test {
    public static void main(String[] args) {
        Genero generoFemino = Genero.FEMININO;
        Genero generoMasculino = Genero.MASULINO;


        String generoMasculinoS = Genero.MASULINO.name();

        String codigoGenernoMas = Genero.MASULINO.getCodigo();

        System.out.println(generoMasculinoS);
        System.out.println(codigoGenernoMas);


    }
}
