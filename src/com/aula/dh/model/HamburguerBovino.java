package com.aula.dh.model;

public  class HamburguerBovino extends Hamburguer {

	public HamburguerBovino( int quantidade, String outros, boolean temQueijo, boolean temSalada) {
		super(TipoCarne.BOVINO, quantidade, outros, temQueijo, temSalada);
	}
	
}
