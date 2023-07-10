package com.hotel.tryc;

import com.hotel.Genero;

public class Aluno {

    private int idade;
    private Genero genero;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new RuntimeException("Idade nao pode ser menor que 18");
        }
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        if (genero.equals(Genero.FEMININO)) {
            throw new RuntimeException("Sistema sõ aceita genero masculino"); // lanca o erro com mensagem
        }
        this.genero = genero;
    }
}
