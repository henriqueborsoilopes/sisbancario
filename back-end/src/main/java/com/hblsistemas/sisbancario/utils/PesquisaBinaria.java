package com.hblsistemas.sisbancario.utils;

import com.hblsistemas.sisbancario.entidades.ContaBanco;

public class PesquisaBinaria {

	 public static ContaBanco pesquisaBinariaContaPorNumConta(String numConta, ContaBanco[] contas){
        int esquerda, meio, direita;
        esquerda = 0;
        direita = contas.length - 1;
        
        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (numConta.hashCode() == contas[meio].getNumConta().hashCode()) {
                return contas[meio];
            }
            if (numConta.hashCode() > contas[meio].getNumConta().hashCode()) {
                esquerda = meio +1;
            } else {
                direita = meio -1;
            }
        }
        return null;
    }
}
