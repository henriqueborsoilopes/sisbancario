package com.hblsistemas.sisbancario.userinterface;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import com.hblsistemas.sisbancario.entidades.Banco;
import com.hblsistemas.sisbancario.entidades.ContaBanco;
import com.hblsistemas.sisbancario.entidades.TransacaoConta;
import com.hblsistemas.sisbancario.entidades.Usuario;
import com.hblsistemas.sisbancario.entidades.enums.TipoTransacao;
import com.hblsistemas.sisbancario.utils.BubbleSort;
import com.hblsistemas.sisbancario.utils.MetodoRecursivo;
import com.hblsistemas.sisbancario.utils.PesquisaBinaria;
import com.hblsistemas.sisbancario.utils.PesquisaLinear;

public class TelaInicial {
	
	private static Scanner sc = new Scanner(System.in);
	private static Banco bancoDoBrasil = new Banco();
	
	public static void cadastrarConta() {
		int posicao = 0;
		int contar = 0;
		System.out.println("CRIAR CONTA. Informe os dados nos campos abaixo: ");
		System.out.println("Pode criar até " + bancoDoBrasil.getContas().length + " contas.");
		do {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Número da conta: ");
			String numConta = sc.next();
			Usuario titular = new Usuario(nome);
			ContaBanco conta = new ContaBanco(numConta, titular);
			System.out.print("Quanto deseja depositar nesta conta? ");
			Double valor = sc.nextDouble();
			TransacaoConta transacao = new TransacaoConta(valor, LocalDateTime.now(), TipoTransacao.ENTRADA);
			conta.addTransacao(posicao, transacao);
			bancoDoBrasil.addConta(posicao, conta);
			posicao++;
			contar++;
		} while (contar != bancoDoBrasil.getContas().length);
	}
	
	public static void exibirContas() {
		System.out.println("EXIBIR CONTAS.");
		System.out.println(Arrays.asList(filtrarContasNaoNulas(bancoDoBrasil.getContas())));
		System.out.print("Informe como deseja ordernar a lista de contas. Digita 0 - por saldo ou 1 - por número da conta: ");
		int resposta = sc.nextInt();
		if (resposta == 0) {
			System.out.println(Arrays.asList(BubbleSort.ordenationContaPorSaldo(filtrarContasNaoNulas(bancoDoBrasil.getContas()))));
		} else if (resposta == 1) {
			System.out.println(Arrays.asList(BubbleSort.ordenationContaPorNumConta(filtrarContasNaoNulas(bancoDoBrasil.getContas()))));
		}
	}
	
	public static void criarTransacaoDeposito() {
		ContaBanco conta;
		Double valor;
		TransacaoConta transacao;
		System.out.println("TRANSAÇÃO - DEPOSITO.");
		System.out.print("Buscar conta (1 - por nome ou 2 - por número da conta): ");
		int resposta = sc.nextInt();
		switch (resposta) {
		case 1:
			System.out.print("Informe o nome: ");
			String nome = sc.next();
			conta = PesquisaLinear.pesquisaLinearContaPorNome(nome, filtrarContasNaoNulas(bancoDoBrasil.getContas()));
			System.out.print("Quanto deseja depositar nesta conta? ");
			valor = sc.nextDouble();
			transacao = new TransacaoConta(valor, LocalDateTime.now(), TipoTransacao.ENTRADA);
			conta.addTransacao(1, transacao);
			break;
		case 2:
			System.out.print("Informe o número da conta: ");
			String numConta = sc.next();
			conta = PesquisaLinear.pesquisaLinearContaPorNome(numConta, filtrarContasNaoNulas(bancoDoBrasil.getContas()));
			System.out.print("Quanto deseja depositar nesta conta? ");
			valor = sc.nextDouble();
			transacao = new TransacaoConta(valor, LocalDateTime.now(), TipoTransacao.ENTRADA);
			conta.addTransacao(1, transacao);
			break;
		default:
			break;
		}
	}
	
	public static void criarTransacaoSaque() {
		System.out.println("TRANSAÇÃO - SAQUE.");
		System.out.println("Informe o número da conta: ");
		String numConta = sc.next();
		ContaBanco conta = PesquisaBinaria.pesquisaBinariaContaPorNumConta(numConta, bancoDoBrasil.getContas());
		System.out.print("Quanto deseja sacar desta conta? ");
		Double valor = sc.nextDouble();
		TransacaoConta transacao = new TransacaoConta(valor, LocalDateTime.now(), TipoTransacao.SAIDA);
		conta.addTransacao(2, transacao);
	}
	
	public static void mostrarSaldoTotalBanco() {
		System.out.println("SALDO TOTAL DO BANCO.");
		System.out.println(MetodoRecursivo.calcularSaldoTotalBanco(bancoDoBrasil.getContas(), 0, 0.0));
	}
	
	public static void mostrarContaComSaldoNegativo() {
		System.out.println("CONTA COM SALDO NEGATIVO DO BANCO.");
		System.out.println(MetodoRecursivo.verificarSaldoNegativo(bancoDoBrasil.getContas(), 0));
	}
	
	private static ContaBanco[] filtrarContasNaoNulas(ContaBanco[] contas) {
		int posicao = 0;
		int qtdContaNaoNula = 0;
		for (ContaBanco conta : contas) {
			if (conta != null) {
				qtdContaNaoNula++;
			}
		}
		ContaBanco[] auxContas = new ContaBanco[qtdContaNaoNula];
		for (ContaBanco conta : contas) {
			if (conta != null) {
				auxContas[posicao] = conta;
				posicao++;
			}
		}
		return auxContas;
	}
}
