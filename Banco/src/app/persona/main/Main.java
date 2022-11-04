package app.persona.main;

import app.persona.*;
import app.persona.util.Generador;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.mostrarInfo();
		
		String x = Generador.nombreApellidoAleatorio();
		System.out.println(x);

	}

}
