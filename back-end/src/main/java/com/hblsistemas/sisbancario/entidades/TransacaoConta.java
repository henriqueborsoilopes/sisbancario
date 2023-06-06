package com.hblsistemas.sisbancario.entidades;

import java.time.LocalDateTime;

import com.hblsistemas.sisbancario.entidades.enums.TipoTransacao;

public class TransacaoConta {
	
	private Double valor;
	private LocalDateTime data;
	private TipoTransacao tipo;
	
	public TransacaoConta() { }
	
	public TransacaoConta(double valor, LocalDateTime data, TipoTransacao tipo) {
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public TipoTransacao getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TransacaoConta [valor=" + valor + ", data=" + data + ", tiop=" + tipo + "]";
	}
}
