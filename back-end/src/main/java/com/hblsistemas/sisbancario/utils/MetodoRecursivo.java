package com.hblsistemas.sisbancario.utils;

import com.hblsistemas.sisbancario.entidades.ContaBanco;

public class MetodoRecursivo {
	
	public static Double calcularSaldoTotalBanco(ContaBanco[] contas, int posicao, Double soma) {
		if (posicao == contas.length) {
			return soma;
		}
		soma += contas[posicao].getSaldo();
		posicao++;
		return calcularSaldoTotalBanco(contas, posicao, soma);
	}
	
	public static String verificarSaldoNegativo(ContaBanco[] contas, int posicao) {
		if (contas[posicao].getSaldo() < 0) {
			return "Conta negativa! Conta " + contas[posicao].getNumConta() + " saldo " + contas[posicao].getSaldo();
		} else if (contas.length == posicao + 1) {
			return "Não tem contas negativas!";
		}
		posicao++;
		return verificarSaldoNegativo(contas, posicao);
	}
}
