package com.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HotelApolo {
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;
    private List<Gerente> listaGerente = new ArrayList<>();
    private List<Recepcionista> listaRecepcionista = new ArrayList<>();
    private List<Hospede> listaHospede = new ArrayList<>();
    private List<Reserva> listaReserva = new ArrayList<>();

    public HotelApolo() {
    }

    public HotelApolo(String nome, Endereco endereco, Telefone telefone, String email,
                      List<Gerente> listaGerente, List<Recepcionista> listaRecepcionista, List<Hospede> listaHospede,
                      List<Reserva> listaReserva) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaGerente = listaGerente;
        this.listaRecepcionista = listaRecepcionista;
        this.listaHospede = listaHospede;
        this.listaReserva = listaReserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Gerente> getListaGerente() {
        return listaGerente;
    }

    public List<Recepcionista> getListaRecepcionista() {
        return listaRecepcionista;
    }


    public List<Hospede> getListaHospede() {
        return listaHospede;
    }

    public void setListaHospede(List<Hospede> listaHospede) {
        this.listaHospede = listaHospede;
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    // crud de gerente

    public void cadastroGerente(Gerente gerente) {
        this.listaGerente.add(gerente);
    }

    public Gerente pesquisaGerente(String nome) {
        Gerente gerente = null;
        for (int i = 0; i < listaGerente.size(); i++) {
            if (listaGerente.get(i).getNome().equals(nome)) {
                gerente = listaGerente.get(i);
            }
        }
        return gerente;
    }

    public void excluirGerente(String nome) {
        Gerente gerente = null;
        for (int i = 0; i < listaGerente.size(); i++) {
            if (listaGerente.get(i).getNome().equals(nome)) {
                gerente = listaGerente.get(i);
                listaGerente.remove(gerente);
                //listaGerente.remove(listaGerente.get(i));
            }
        }
    }

    public List<Gerente> listaGerente() {
        return listaGerente;
    }

    // crud de recepcionista

    public void cadastroRecepcionista(Recepcionista recepcionista) {
        this.listaRecepcionista.add(recepcionista);
    }

    public Recepcionista pesquisaRecepcionista(String nome) {
        Recepcionista recepcionista = null;
        for (int i = 0; i < listaRecepcionista.size(); i++) {
            if (listaRecepcionista.get(i).getNome().equals(nome)) {
                recepcionista = listaRecepcionista.get(i);
            }
        }
        return recepcionista;

    }

    public void excluirRecepcionista(String nome) {
        Recepcionista recepcionista = null;
        for (int i = 0; i < listaRecepcionista.size(); i++) {
            if (listaRecepcionista.get(i).getNome().equals(nome)) {
                recepcionista = listaRecepcionista.get(i);
                listaRecepcionista.remove(recepcionista);

            }
        }
    }

    public List<Recepcionista> listaRecepcionista() {
        return listaRecepcionista;
    }
    //cadastro hospede crud

    public void cadastroHospede(Hospede hospede) {
        this.listaHospede.add(hospede);
    }

    public Hospede pesquisaHospede(String nome) {
        Hospede hospede = null;
        for (int i = 0; i < listaHospede.size(); i++) {
            if (listaHospede.get(i).getNome().equals(nome)) {
                hospede = listaHospede.get(i);
            }
        }
        return hospede;
    }

    public void excluirHospede(String nome) {
        Hospede hospede = null;
        for (int i = 0; i < listaHospede.size(); i++) {
            if (listaHospede.get(i).getNome().equals(nome)) {
                hospede = listaHospede.get(i);
                listaHospede.remove(hospede);
            }
        }
    }

    public List<Hospede> listaHospede() {
        return listaHospede;
    }
    //cadastro Reserva

    public void cadastroReserva(Reserva reserva) {
        this.listaReserva.add(reserva);
    }

    public void excluirReserva(int codigo) {
        Reserva reserva = null;
        for (int i = 0; i < listaReserva.size(); i++) {
            if (listaReserva.get(i).getCodigo() == codigo) {
                reserva = listaReserva.get(i);
                listaReserva.remove(reserva);
            }

        }
    }

    public double valorTotal() {
        double total = 0;
        for (int i = 0; i < listaReserva.size(); i++) {
            total = total + listaReserva.get(i).getValor();
        }

        return total;

    }


}

