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
			System.out.println(bovino);
		}
		
		if (tipo.equalsIgnoreCase("suino")) {
			HamburguerSuino suino = new HamburguerSuino(1, "teste", false, false);
			System.out.println(suino);
		}
		
		if (tipo.equalsIgnoreCase("frango")) {
			HamburguerFrango frango = new HamburguerFrango(1, "teste", false, false);
			System.out.println(frango);
		}
		
		if (tipo.equalsIgnoreCase("misto")) {
			HamburguerMisto misto = new HamburguerMisto(1, "teste", false, false);
			System.out.println(misto);
		}
	}
}
