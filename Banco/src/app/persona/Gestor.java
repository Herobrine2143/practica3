package app.persona;

public class Gestor extends Persona {

	public Gestor(int id, String usuario, String password, String correo) {
		super(id, usuario, password, correo);
	}

	public Gestor() {
		super();
	}
	
	public Gestor(String usuario) {
		super(usuario);
	}
	
	public Gestor(int id, String usuario) {
		super(id,usuario);
	}
	
	public String getGestor(int id) {
		return this.usuario;
		
	}

//	public Gestor(String usuario, String password, String correo) {
//		super(usuario, password, correo);
//	}

//	public Gestor(String usuario, String correo) {
//		super(usuario, correo);
//	}

}
