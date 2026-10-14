package com.krakedev.herencia;

public class Padre {
	
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;
	
	@Override
	public String toString() {
		return "Defectos=" + defectos + ", Virtudes=" + virtudes + ", Ahorros=" + totalAhorrado + ", Nombre: " + nombre;
	}
	
//	public Padre() {
//		System.out.println("Soy el constructor vacio de Padre");
//	}
	
	public Padre(int defectos, int virtudes, String nombre) {
		this.defectos = defectos;
		this.virtudes = virtudes;
		this.nombre = nombre;
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
	
	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void imprimir() {
		System.out.println("Los defectos son: " + defectos);
		System.out.println("Las virtudes son: " + virtudes);
	}
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	public void ahorrar(double monto){
		totalAhorrado += monto;
	}
	
	
}
