package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre p = new Padre(5,8,"Pablo");
		p.ahorrar(500);
		System.out.println(p);
		
		Hija hija = new Hija(3,5,"Emily");
		hija.ahorrar(500);
		System.out.println(hija);
		
		Hijo hijo = new Hijo(4,3,7,"Rubén");
		hijo.ahorrar(500);
		System.out.println(hijo);

	}

}
