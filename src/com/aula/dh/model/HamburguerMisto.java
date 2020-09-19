package com.aula.dh.model;

public class HamburguerMisto extends Hamburguer{
		
	public HamburguerMisto(int quantidade, String outros, boolean temQueijo, boolean temSalada) {
		super(TipoCarne.MISTO, quantidade, outros, temQueijo, temSalada);
	}
	
	@Override
	public String toString() {
		return "Hamburguer [tipo=" + super.getTipo() + ", quantidade=" + super.getQuantidade() + ", outros=" + super.getOutros() + ", temQueijo="
				+ super.isTemQueijo() + ", temSalada=" + super.isTemSalada() + "]";
	}
	


}
