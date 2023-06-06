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
import com.hblsistemas.sisbancario.utils.PesquisaLinear;

public class TelaInicial {
	
	private static Scanner sc = new Scanner(System.in);
	private static Banco bancoDoBrasil = new Banco();
	
	public static void cadastrarConta() {
		int resposta = 0;
		int posicao = 0;
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
			System.out.print("Deseja encerrar? 0 - continuar ou 1 - sair: ");
			resposta = sc.nextInt();
		} while (resposta != 1);
	}
	
	public static void exibirContas() {
		System.out.println("EXIBIR CONTAS.");
		System.out.println(Arrays.asList(filtrarContasNaoNulas(bancoDoBrasil.getContas())));
		System.out.print("Informe como deseja ordernar a lista de contas. Digita 0 - por saldo ou 1 - por número da conta: ");
		int resposta = sc.nextInt();
		if (resposta == 0) {
			BubbleSort.ordenationContaPorSaldo(filtrarContasNaoNulas(bancoDoBrasil.getContas()));
			System.out.println(Arrays.asList(filtrarContasNaoNulas(bancoDoBrasil.getContas())));
		} else if (resposta == 1) {
			BubbleSort.ordenationContaPorNumConta(filtrarContasNaoNulas(bancoDoBrasil.getContas()));
			System.out.println(Arrays.asList(filtrarContasNaoNulas(bancoDoBrasil.getContas())));
		}
	}
	
	public static void criarTransacaoDeposito() {
		ContaBanco conta;
		Double valor;
		TransacaoConta transacao;
		System.out.println("TRANSAÇÃO - DEPOSITO.");
		System.out.print("Buscar conta (0 - por nome ou 1 - por número da conta): ");
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
			break;
		default:
			break;
		}
	}
	
	public static void criarTransacaoSaque() {
		System.out.println("TRANSAÇÃO - SAQUE.");
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
