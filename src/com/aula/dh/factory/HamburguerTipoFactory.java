package com.aula.dh.factory;

import com.aula.dh.model.HamburguerBovino;
import com.aula.dh.model.HamburguerFrango;
import com.aula.dh.model.HamburguerMisto;
import com.aula.dh.model.HamburguerSuino;

public class HamburguerTipoFactory extends HamburguerFactory {

	@Override
	public void criarHamburguer(String tipo) {
		
		if (tipo.equalsIgnoreCase("bovino")) {
			HamburguerBovino bovino = new HamburguerBovino(1, "teste", false, false);
		}
		
		if (tipo.equalsIgnoreCase("suino")) {
			HamburguerSuino suino = new HamburguerSuino(1, "teste", false, false);
		}
		
		if (tipo.equalsIgnoreCase("bovino")) {
			HamburguerFrango frango = new HamburguerFrango(1, "teste", false, false);
		}
		
		if (tipo.equalsIgnoreCase("bovino")) {
			HamburguerMisto misto = new HamburguerMisto(1, "teste", false, false);
		}
	}
}
