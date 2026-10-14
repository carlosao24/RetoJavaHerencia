package com.krakedev.herencia;

public class Padre {
	
	private int defectos;
	private int virtudes;
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	
//	public Padre() {
//		System.out.println("Soy el constructor vacio de Padre");
//	}
	
	public Padre(int defectos, int virtudes) {
		this.defectos = defectos;
		this.virtudes = virtudes;
	}
	
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	public void imprimir() {
		System.out.println("Los defectos son: " + defectos);
		System.out.println("Las virtudes son: " + virtudes);
	}
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	
}
