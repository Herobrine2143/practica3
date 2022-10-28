package app.curso.banco.entidad;

import java.util.Random;
import app.curso.banco.util.Utiles;

public class Gestor extends Persona {

	//Random idRnd = new Random();
	
	private int idGestor;
	
	public Gestor() {
		super();
		this.idGestor = Utiles.numeroAleatorio();
	}

	public Gestor(int id, String nombre, String telefono, int idGestor) {
		super(id, nombre, telefono);
		this.idGestor = idGestor;
	}

	public int getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(int idGestor) {
		this.idGestor = idGestor;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("ID Gestor: " + this.idGestor);
	}

}
