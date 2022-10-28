package app.curso.banco.entidad;

public class Gestor extends Persona {

	private int idGestor;
	
	public Gestor() {
		
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
