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
		TelaInicial.criarTransacaoDeposito();
		TelaInicial.criarTransacaoSaque();
		TelaInicial.mostrarSaldoTotalBanco();
		TelaInicial.mostrarContaComSaldoNegativo();
	}

}
