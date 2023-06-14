package com.hblsistemas.atividade.exercicio2;

import java.util.Arrays;

public class Linear extends MetodoPesquisa {
    
    @Override
    public void pesquisar(){
        int[] vet = super.getVetorOrdenado();
        int numPesq = super.getNumPesquisa();
        
        String posicoes = "";
        for (int i = 0; i < vet.length; i++) {
            if(numPesq == vet[i]){
                posicoes += i;
                if(i < vet.length-1)
                    posicoes += ", ";
            }
        }
        super.setPosicoesPesquisa(posicoes);
    }

    @Override
    public String toString() {
        return "Posicoes encontradas na pesquisa de '"+ super.getNumPesquisa() + "': \n" + super.getPosicoesEncontradas() + "\nVetor: \n" + Arrays.toString(super.getVetorOrdenado()) + "\nVetor não ordenado: \n" + Arrays.toString(super.getVetor());
    }
    
    
}
