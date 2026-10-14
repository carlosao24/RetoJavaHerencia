package com.krakedev.herencia;

public class Hijo extends Padre{
	
	private int juguetes;

	public Hijo(int defectos, int virtudes, int juguetes, String nombre) {
		super(defectos, virtudes,nombre);
		this.juguetes = juguetes;
	}
	@Override
	public void ahorrar(double monto){
		super.ahorrar(monto * 0.5);
	}
	
	@Override
	public String toString() {
		return "Defectos: "+getDefectos()+" ,Virtudes: "+getVirtudes()+", Juguetes: "+juguetes+", Ahorros: "+getTotalAhorrado()+ ", Nombre: "+ getNombre();
	}
	
}
