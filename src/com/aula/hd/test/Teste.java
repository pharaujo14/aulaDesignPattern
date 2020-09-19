package com.aula.hd.test;

import com.aula.dh.factory.HamburguerFactory;
import com.aula.dh.factory.HamburguerTipoFactory;

public class Teste {
	
	public static void main(String[] args) {
		
		HamburguerFactory hamburguer = new HamburguerTipoFactory();
		
		hamburguer.criarHamburguer("misto");
		System.out.println(hamburguer.toString());
		
	}

}
