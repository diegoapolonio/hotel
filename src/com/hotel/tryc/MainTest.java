package com.hotel.tryc;

import com.hotel.Genero;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        try { // trata o erro
            aluno.setIdade(10);
            aluno.setGenero(Genero.FEMININO);
        } catch (RuntimeException exception) { // pega o erro
            System.out.println(exception.getMessage()); // mostra mensagem do erro
        }

    }
}
