package com.hblsistemas.sisbancario.utils;

import com.hblsistemas.sisbancario.entidades.ContaBanco;

public class PesquisaLinear {
	
	public static ContaBanco pesquisaLinearContaPorNome(String nome, ContaBanco[] contas){
        for (int i = 0; i < contas.length; i++) {
            if (nome == contas[i].getTitular().getNome()){
                return contas[i];
            }
        }
        return null;
    }
	
	public static ContaBanco pesquisaLinearContaPorNumConta(String numConta, ContaBanco[] contas){
        for (int i = 0; i < contas.length; i++) {
            if (numConta == contas[i].getNumConta()) {
                return contas[i];
            }
        }
        return null;
    }
}
