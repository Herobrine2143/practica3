package app.persona;

import app.persona.util.Generador;

public class Cliente extends Persona {
	
	private int idGestor;
	private float saldo;

	public Cliente(int id, String usuario, String password, String correo, int idGestor, float saldo) {
		super(id, usuario, password, correo);
		this.idGestor = idGestor;
		this.saldo = saldo;
	}
	
	public Cliente() {
		super();
		this.idGestor = Generador.numeroAleatorio();
		this.saldo = Generador.numeroDecimalAleatorio();
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("ID del Gestor: " + this.idGestor + "\nSaldo: " + this.saldo);
		System.out.println("\n--------");
	}

	public int getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(int idGestor) {
		this.idGestor = idGestor;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
