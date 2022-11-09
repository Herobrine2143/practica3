package app.persona.main;

import app.persona.Gestor;
import app.persona.util.Database;

public class TEst45 {
	public static void main(String[] args) {
		Database database = new Database();
		Gestor gestor = database.getGestor(154);
		gestor.setCorreo("correo@correo.com");
		database.actualizarGestores(gestor);
	}
}
