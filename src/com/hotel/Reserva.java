package com.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private LocalDate dataDeEntrada;
    private LocalDate dataDeSaida;
    private int codigo;
    private double valor;

    public Reserva() {

    }

    public Reserva(String dataDeEntradaString, String dataDeSaidaString, int codigo, double valor) {
        this.dataDeEntrada = LocalDate.parse(dataDeEntradaString, DateTimeFormatter.ofPattern("dd/MM/yy"));
        this.dataDeSaida = LocalDate.parse(dataDeSaidaString, DateTimeFormatter.ofPattern("dd/MMyy"));
        this.codigo = codigo;
        this.valor = valor;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntradaString) {
        this.dataDeEntrada = LocalDate.parse(dataDeEntradaString, DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    public LocalDate getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(String dataDeSaidaString) {
        this.dataDeSaida = LocalDate.parse(dataDeSaidaString, DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
