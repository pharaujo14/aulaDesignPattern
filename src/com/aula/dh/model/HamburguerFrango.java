package com.aula.dh.model;

public  class HamburguerFrango extends Hamburguer {

	public HamburguerFrango( int quantidade, String outros, boolean temQueijo, boolean temSalada) {
		super(TipoCarne.FRANGO, quantidade, outros, temQueijo, temSalada);
	}
	
	@Override
	public String toString() {
		return "Hamburguer [tipo=" + super.getTipo() + ", quantidade=" + super.getQuantidade() + ", outros=" + super.getOutros() + ", temQueijo="
				+ super.isTemQueijo() + ", temSalada=" + super.isTemSalada() + "]";
	}
	
}
