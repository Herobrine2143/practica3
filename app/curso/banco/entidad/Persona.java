package app.curso.banco.entidad;

import java.util.Random;
import app.curso.banco.util.Utiles;

public class Persona {

	Random random = new Random();

	// public int idRnd = random.nextInt(100);
	public String nombreAleatorio = Utiles.nombreAleatorio();
	protected int id;
	protected String nombre;
	protected String telefono;
	protected String username;
	protected String password;

	public Persona() {
		this.id = Utiles.numeroAleatorio();
		this.nombre = nombreAleatorio;
		this.telefono = Utiles.numeroTelefono();
	}

//	public Persona(String telefono) {
//		this.id = Utiles.numeroAleatorio();
//		this.nombre = nombreAleatorio;
//		this.telefono = telefono;
//	}

	public Persona(int id) {
		this.id = id;
		this.nombre = nombreAleatorio;
		this.telefono = Utiles.numeroTelefono();
	}

	// Constructor parametizado
	public Persona(int id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = Utiles.numeroTelefono();
	}

//	public Persona1(int kybId, String kybNombre, String kybTelefono) {
//		this.id = kybId;
//		this.nombre = kybNombre;
//		this.telefono = kybTelefono;
//		
//	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// Metodo
	public void mostrarInfo() {
		System.out.println("\nID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Teléfono: " + this.telefono);
	}

}
