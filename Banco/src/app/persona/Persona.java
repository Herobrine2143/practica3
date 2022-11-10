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

	public Persona(String usuario, String password, String correo) {
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}

	public Persona(String usuario, String correo) {
		this.usuario = usuario;
		this.correo = correo;
	}
	
	public Persona(String usuario) {
		this.usuario = usuario;
	}
	
	public Persona(int id, String usuario) {
		this.id = id;
		this.usuario = usuario;
	}

	public Persona() {
		this.id = Generador.numeroAleatorio(20);
		this.usuario = Generador.nombreAleatorio();
		this.password = Generador.nombreAleatorio() + Generador.numeroAleatorio(5000000);
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
