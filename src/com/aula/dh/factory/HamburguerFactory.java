package com.aula.dh.factory;

import com.aula.dh.model.Hamburguer;

public abstract class HamburguerFactory {
	
	protected Hamburguer hamburguer;
	
	public abstract void criarHamburguer(String tipo);

}
