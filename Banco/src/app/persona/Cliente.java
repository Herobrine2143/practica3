package app.persona;

import app.persona.util.Generador;

public class Cliente extends Persona {
	
	private int idGestor;
	// saldo estaba en float. Cambiado a double
	private double saldo;

	public Cliente(int id, String usuario, String password, String correo, int idGestor, float saldo) {
		super(id, usuario, password, correo);
		this.idGestor = idGestor;
		this.saldo = saldo;
	}
	
	public Cliente() {
		super();
		this.idGestor = Generador.numeroAleatorio(900);
		this.saldo = Generador.floatEntre(200.99f,20.1f);
	}
	
	public Cliente(int idGestor) {
		super();
		this.idGestor = idGestor;
		this.saldo = Generador.floatEntre(200.99f, 20.1f);
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("ID del Gestor: " + this.idGestor + "\nSaldo: " + this.saldo);
		System.out.println("\n...");
	}
	
	public void restarSaldo(float saldo) {
		this.saldo -= saldo;
	}

	public int getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(int idGestor) {
		this.idGestor = idGestor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
