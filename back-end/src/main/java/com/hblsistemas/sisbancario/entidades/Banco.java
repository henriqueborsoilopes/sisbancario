package com.hblsistemas.sisbancario.entidades;

import java.util.Arrays;

public class Banco {
	
	private ContaBanco[] contas = new ContaBanco[3];
	
	public ContaBanco[] getContas() {
		return contas;
	}
	
	public void addConta(int posicao, ContaBanco conta) {
		contas[posicao] = conta;
	}
	
	public Double getValorTotalNoBanco() {
		Double valor = 0.0;
		for (ContaBanco conta : contas) {
			valor += conta.getSaldo();
		}
		return valor;
	}
	
	public ContaBanco[] getContasNegativas() {
		ContaBanco[] auxContas = new ContaBanco[this.contas.length];
		int posicao = 0;
		for (ContaBanco conta : this.contas) {
			if (conta != null) {
				if (conta.getSaldo() < 0.0) {
					auxContas[posicao] = conta;
					posicao++;
				}
			}
		}
		return auxContas;
	}

	@Override
	public String toString() {
		return "Banco [contas=" + Arrays.toString(contas) + "]";
	}
}
