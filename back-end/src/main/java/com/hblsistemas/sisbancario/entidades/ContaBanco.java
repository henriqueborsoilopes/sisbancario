package com.hblsistemas.sisbancario.entidades;

import com.hblsistemas.sisbancario.entidades.enums.TipoTransacao;

public class ContaBanco {

	private String numConta;
	private Double saldo = 0.0;
	
	private Usuario titular;
	private TransacaoConta[] transacoes = new TransacaoConta[3];
	
	public ContaBanco() { }
	
	public ContaBanco(String numConta, Usuario titular) {
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	private void atualizarSaldo(Double valor) {
		saldo += valor;
	}
	
	public Usuario getTitular() {
		return titular;
	}
	
	public void setTitular(Usuario titular) {
		this.titular = titular;
	}
	
	public TransacaoConta[] getTransacoes() {
		return transacoes;
	}
	
	public void addTransacao(int posicao, TransacaoConta transacao) {
		atualizarSaldo(transacao.getTipo() == TipoTransacao.ENTRADA ? transacao.getValor() : - transacao.getValor());
		transacoes[posicao] = transacao;
	}

	@Override
	public String toString() {
		return "ContaBanco [numConta=" + numConta + ", saldo=" + saldo + ", titular=" + titular + "]\n";
	}
}
