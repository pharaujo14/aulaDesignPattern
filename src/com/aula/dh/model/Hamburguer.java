package com.aula.dh.model;

public abstract class Hamburguer {
	
	private TipoCarne tipo;
	private int quantidade;
	private String outros;
	private boolean temQueijo;
	private boolean temSalada;
	
	public Hamburguer(TipoCarne tipo, int quantidade, String outros, boolean temQueijo, boolean temSalada) {
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.outros = outros;
		this.temQueijo = temQueijo;
		this.temSalada = temSalada;
	}
	
	public TipoCarne getTipo() {
		return tipo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String getOutros() {
		return outros;
	}
	
	public boolean isTemQueijo() {
		return temQueijo;
	}

	public void setTemQueijo(boolean temQueijo) {
		this.temQueijo = temQueijo;
	}

	public boolean isTemSalada() {
		return temSalada;
	}

	public void setTemSalada(boolean temSalada) {
		this.temSalada = temSalada;
	}

	@Override
	public String toString() {
		return "Hamburguer [tipo=" + tipo + ", quantidade=" + quantidade + ", outros=" + outros + ", temQueijo="
				+ temQueijo + ", temSalada=" + temSalada + "]";
	}
	
	
	
	
	
	
}
