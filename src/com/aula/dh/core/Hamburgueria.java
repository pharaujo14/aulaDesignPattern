package com.aula.dh.core;

import com.aula.dh.model.Hamburguer;
import com.aula.dh.model.HamburguerBovino;
import com.aula.dh.model.HamburguerFrango;

public class Hamburgueria {
	
	public Hamburguer pedido(String carne, int quantidadeCarne, String observacao) {
		
		if("frango".equalsIgnoreCase(carne)) {
			return new HamburguerFrango(quantidadeCarne, observacao);
		} else if ("frango".equalsIgnoreCase(carne)) {
			return new HamburguerBovino(quantidadeCarne, observacao);
		}
		//outros tipos 
		
		return null;
	}

}
