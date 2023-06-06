package com.hblsistemas.sisbancario;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hblsistemas.sisbancario.userinterface.TelaInicial;

@SpringBootApplication
public class SisbancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisbancarioApplication.class, args);
		
		TelaInicial.cadastrarConta();
		TelaInicial.exibirContas();
		
//		Usuario titular_1 = new Usuario("Henrique");
//		Usuario titular_2 = new Usuario("Matheus");
//		Usuario titular_3 = new Usuario("João");
//		Usuario titular_4 = new Usuario("Maria");
//		Usuario titular_5 = new Usuario("Camila");
//		
//		ContaBanco conta_1 = new ContaBanco("00240508", titular_1);
//		ContaBanco conta_2 = new ContaBanco("00240509", titular_2);
//		ContaBanco conta_3 = new ContaBanco("00240510", titular_3);
//		ContaBanco conta_4 = new ContaBanco("00240511", titular_4);
//		ContaBanco conta_5 = new ContaBanco("00240512", titular_5);
//		
//		Banco bancoDoBrasil = new Banco();
//				
//		bancoDoBrasil.addConta(0, conta_1);
//		bancoDoBrasil.addConta(1, conta_2);
//		bancoDoBrasil.addConta(2, conta_3);
//		bancoDoBrasil.addConta(3, conta_4);
//		bancoDoBrasil.addConta(4, conta_5);
//		
//		TransacaoConta transacao_1 = new TransacaoConta(29.0, LocalDateTime.now(), TipoTransacao.ENTRADA);
//		TransacaoConta transacao_2 = new TransacaoConta(28.0, LocalDateTime.now(), TipoTransacao.ENTRADA);
//		TransacaoConta transacao_3 = new TransacaoConta(27.0, LocalDateTime.now(), TipoTransacao.ENTRADA);
//		TransacaoConta transacao_4 = new TransacaoConta(26.0, LocalDateTime.now(), TipoTransacao.ENTRADA);
//		TransacaoConta transacao_5 = new TransacaoConta(25.0, LocalDateTime.now(), TipoTransacao.ENTRADA);
//		TransacaoConta transacao_6 = new TransacaoConta(50.0, LocalDateTime.now(), TipoTransacao.SAIDA);
//		
//		conta_1.setSaldo(transacao_1.getTipo() == TipoTransacao.SAIDA ? - transacao_1.getValor() : transacao_1.getValor());
//		conta_1.addTransacao(0, transacao_1);
//		
//		conta_2.setSaldo(transacao_2.getTipo() == TipoTransacao.SAIDA ? - transacao_2.getValor() : transacao_2.getValor());
//		conta_2.addTransacao(0, transacao_2);
//		
//		conta_3.setSaldo(transacao_3.getTipo() == TipoTransacao.SAIDA ? - transacao_3.getValor() : transacao_3.getValor());
//		conta_3.addTransacao(0, transacao_3);
//		
//		conta_4.setSaldo(transacao_4.getTipo() == TipoTransacao.SAIDA ? - transacao_4.getValor() : transacao_4.getValor());
//		conta_4.addTransacao(0, transacao_4);
//		
//		conta_5.setSaldo(transacao_5.getTipo() == TipoTransacao.SAIDA ? - transacao_5.getValor() : transacao_5.getValor());
//		conta_5.addTransacao(0, transacao_5);
//		
//		conta_5.setSaldo(transacao_6.getTipo() == TipoTransacao.SAIDA ? - transacao_6.getValor() : transacao_6.getValor());
//		conta_5.addTransacao(0, transacao_6);
//		
//		BubbleSort.ordenationContaPorSaldo(bancoDoBrasil.getContas());
//		
//		System.out.println();
//		System.out.println(bancoDoBrasil);
//		
//		BubbleSort.ordenationContaPorNumConta(bancoDoBrasil.getContas());
//		System.out.println();
//		System.out.println(bancoDoBrasil);
//		System.out.println();
//		
//		System.out.println(PesquisaLinear.pesquisaLinearContaPorNome("Henrique", bancoDoBrasil.getContas()));
//		System.out.println(PesquisaLinear.pesquisaLinearContaPorNumConta("00240509", bancoDoBrasil.getContas()));
//		System.out.println(PesquisaBinaria.pesquisaBinariaContaPorNumConta("00240508", bancoDoBrasil.getContas()));
//		
//		System.out.println(bancoDoBrasil.getValorTotalNoBanco());
//		
//		for (ContaBanco conta : bancoDoBrasil.getContasNegativas()) {
//			if (conta != null) {
//				System.out.println(conta);
//			}
//		}
	}

}
