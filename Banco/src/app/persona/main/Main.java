package app.persona.main;

import app.persona.*;
import app.persona.util.Generador;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.mostrarInfo();
		String v = c1.getPassword();
		System.out.println(v);
		
		int x = Generador.numeroAleatorio(100);
		System.out.println(x);
	}

}
