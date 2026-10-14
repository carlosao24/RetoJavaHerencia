package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Hija> ListaDeHijas = new ArrayList<Hija>();
		
		Hija hija1 = new Hija(2,4);
		
		ListaDeHijas.add(hija1);
		
		
		Hija hija2 = new Hija(6,1);
		
		ListaDeHijas.add(hija2);
		
		Hija hija3 = new Hija(6,1);
		ListaDeHijas.add(hija3);
		
		System.out.println(ListaDeHijas);
		
	}

}
