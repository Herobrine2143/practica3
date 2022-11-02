package app.curso.banco.main;

import java.util.HashMap;

import app.curso.banco.entidad.*;
import app.curso.banco.util.Utiles;
//import app.curso.banco.entidad.Gestor;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(1, "Ana Martinez", "78465433");

		c1.abrirCuenta("ES123", 100f);

		c1.mostrarCuenta();

		Gestor g2 = new Gestor(45, "Carla", "654 874 751", 99);

		// c2.setId(3);

		g2.mostrarInfo();

		//Transferencia t1 = new Transferencia(4, Mensaje.TIPO_CLIENTE, c1.getId(),Mensaje.TIPO_GESTOR,g2.getId(),100);
		
		System.out.println();
		
		c1.mostrarCuenta();

//		Cliente c1 = new Cliente(1, "Alvaro", "648 485 124", 0);
//
//		c1.mostrarInfo();
//
//		Cliente c2 = new Cliente(2, "Jose", "8745 145 478", 0);
//
//		c2.ingresarDinero(245);
//		
//		c2.mostrarInfo();
//		
//		//System.out.println(c2.dineroAntes);
//
//		c2.ingresarDinero(142);
//
//		c2.mostrarInfo();
//
//		c2.retirarDinero(100);
//
//		c2.mostrarInfo();
//		
//		c2.abrirCuenta("C2", 13.0f);
//		
//		c2.ingresarDinero("C2", 50f);
//		
//		c2.mostrarInfo();
//		
//		//c2.cerrarCuenta("C2");
//		
//		c2.retirarDinero("C2", 4f);
//		
//		c2.mostrarCuenta();
//		
//		c2.mostrarInfo();
//		
//		Gestor g1 = new Gestor(24,"Ana","784 548 965", 3);
//		
//		g1.mostrarInfo();

		Mensaje m2 = new Mensaje(1, Mensaje.TIPO_CLIENTE, 2, Mensaje.TIPO_GESTOR, 5, "Hello");

		System.out.println("\nMensaje: " + m2);
	}

}
