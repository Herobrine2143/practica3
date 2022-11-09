package app.persona;

import app.persona.util.Generador;

public class Prestamo {

	private int id;
	private String nombre;
	private double comision;
	private int meses;
	
	public Prestamo(String nombre, double comision, int meses) {
		this.id = Generador.intEntre(1, 50);
		this.nombre = nombre;
		this.comision = comision;
		this.meses = meses;
	}
	
	public void mostrarPrestamos() {
		System.out.println("ID: " + this.id);
		System.out.println("Nombre del prestamo: " + this.nombre);
		System.out.println("Comision: " + this.comision);
		System.out.println("Meses: " + this.meses);
	}
}
