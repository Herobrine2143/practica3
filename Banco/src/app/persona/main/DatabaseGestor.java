package app.persona.main;

import app.persona.Gestor;
import app.persona.util.Database;

public class DatabaseGestor {

	public static void main(String[] args) {

		Database database = new Database();

		System.out.println("Antes de la inserccion: \n");
		database.mostrarGestores();

		Gestor gestor = new Gestor();
		database.insertarGestor(gestor);

		System.out.println("Despues de la inserccion: ");
		database.mostrarGestores();

		database.borrarGestor(23);

		database.actualizarGestores(gestor);

	}

}
