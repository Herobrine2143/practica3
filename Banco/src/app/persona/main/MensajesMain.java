package app.persona.main;

import app.movimiento.Mensaje;
import app.persona.util.Database;

public class MensajesMain {

	public static void main(String[] args) {

		Database database = new Database();

		Mensaje mensaje = new Mensaje(154, 155, "Hola buenas");

		database.enviarMensaje(mensaje);

		database.mostrarMensajes();

	}

}
