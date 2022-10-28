package app.curso.banco.entidad;

public class Persona {
	protected int id;
	protected String nombre;
	protected String telefono;

	public Persona() {
		this.id = 0000;
		this.nombre = "null";
		this.telefono = "000 000 000";
	}
	
	// Constructor parametizado
	public Persona(int id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
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
