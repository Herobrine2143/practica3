package app.persona;

public class Gestor extends Persona {

	public Gestor(int id, String usuario, String password, String correo) {
		super(id, usuario, password, correo);
		
	}
	
	public Gestor(String usuario, String password, String correo) {
		super(usuario, password, correo);
	}
	
	public Gestor(String usuario, String correo) {
		super(usuario, correo);
	}
	
	public Gestor() {
	}

}
