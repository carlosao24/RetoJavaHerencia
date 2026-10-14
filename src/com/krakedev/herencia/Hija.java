package com.krakedev.herencia;

public class Hija extends Padre{
	
	public Hija(int defectos, int virtudes) {
		super(defectos, virtudes);
	}

	public void escucharAvicii() {
		System.out.println("Escuchando electrónica");
	}

	@Override
	public String toString() {
		return "Defectos: "+ getDefectos() + ", Virtudes; "+ getVirtudes();
	}
	
}
