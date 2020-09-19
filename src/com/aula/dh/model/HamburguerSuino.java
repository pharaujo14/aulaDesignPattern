package com.aula.dh.model;

public class HamburguerSuino extends Hamburguer {

	public HamburguerSuino(int quantidade, String outros, boolean temQueijo, boolean temSalada) {
		super(TipoCarne.SUINO, quantidade, outros, temQueijo, temSalada);
	}
	
	@Override
	public String toString() {
		return "Hamburguer [tipo=" + super.getTipo() + ", quantidade=" + super.getQuantidade() + ", outros=" + super.getOutros() + ", temQueijo="
				+ super.isTemQueijo() + ", temSalada=" + super.isTemSalada() + "]";
	}

}
