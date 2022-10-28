package app.curso.banco.util;

import java.util.ArrayList;
import java.util.Random;
import app.curso.banco.main.TestRandom;

public class Utiles {
	
	ArrayList<String> nombresCompletos = new ArrayList();
	
	public static final String[] NOMBRES = { "Alvaro", "Jose", "Juan", "Pedro" };

	public static final String[] APELLIDOS = { "Pascal", "Mareno", "Francisco", "Talo" };

	public static String nombreAleatorio(String[] nombres, String[] apellidos) {
			
		Random random = new Random();
		int index2 = random.nextInt(apellidos.length);
		String apellidoAleatorio = apellidos[index2];
		int index = random.nextInt(nombres.length);
		String nombreAleatorio = nombres[index];
		
		String nombreCompleto = (nombres[index] + " " + apellidos[index2]);
		
		return nombreCompleto;
		
	}
	
	public static String nombreAleatorio() {
		
//		Random random = new Random();
//		int index2 = random.nextInt(APELLIDOS.length);
//		String apellidoAleatorio = APELLIDOS[index2];
//		int index = random.nextInt(NOMBRES.length);
//		String nombreAleatorio = NOMBRES[index];
//		
//		String nombreCompleto = (NOMBRES[index] + " " + APELLIDOS[index2]);
		
		return nombreAleatorio(NOMBRES,APELLIDOS);
		
	}
	
}
