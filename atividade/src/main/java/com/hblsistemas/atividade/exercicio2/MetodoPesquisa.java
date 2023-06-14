package com.hblsistemas.atividade.exercicio2;

import java.util.Arrays;

public abstract class MetodoPesquisa extends Vetor {
    
    private String posicoesEncontradas;
    private int numPesquisa;

    public MetodoPesquisa(int numPesquisa, int[] vetor) {
        super(vetor);
        this.numPesquisa = numPesquisa;
    }

    public MetodoPesquisa() {
    }
    
    public abstract void pesquisar();

    public String getPosicoesEncontradas() {
        return posicoesEncontradas;
    }

    public void setPosicoesPesquisa(String posicoesPesquisa) {
        this.posicoesEncontradas = posicoesPesquisa;
    }

    public int getNumPesquisa() {
        return numPesquisa;
    }

    public void setNumPesquisa(int numPesquisa) {
        this.numPesquisa = numPesquisa;
    }

    @Override
    public String toString() {
        return "Posicoes encontradas na pesquisa de '"+ numPesquisa + "': \n" + posicoesEncontradas + "\nVetor: \n" + Arrays.toString(super.getVetor()) +'}';
    }
}
