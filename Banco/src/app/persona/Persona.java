package app.persona;

import app.persona.util.Generador;

public class Persona {

	public String nombreAleatorio = Generador.nombreAleatorio();

	protected int id;
	protected String usuario;
	protected String password;
	protected String correo;

	public Persona(int id, String usuario, String password, String correo) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}

	public Persona() {
		this.id = Generador.numeroAleatorio();
		this.usuario = Generador.nombreAleatorio();
		this.password = Generador.nombreApellidoAleatorio();
		this.correo = Generador.correoElectronico();
	}

	public void mostrarInfo() {
		System.out.println("\nID: " + this.id);
		System.out.println("Usuario: " + this.usuario);
		System.out.println("Correo: " + this.correo);

		// System.out.println("Contraseña: " + this.password);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setNombre(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
