package app.curso.banco.util;

//import java.util.ArrayList;
import java.util.Random;
//import app.curso.banco.main.TestRandom;

public class Utiles {
	
	static Random intNumbers = new Random();
	//ArrayList<String> nombresCompletos = new ArrayList();
	
	public static final String[] NOMBRES = { "Alvaro", "Jose", "Juan", "Pedro", "Ana", "Sara", "Elena", "Isabel" };

	public static final String[] APELLIDOS = { "Pascal", "Mareno", "Francisco", "Talo","Lopez", "Fatima","de la Cruz", "Martinez" };

	public static String nombreApellidoAleatorio(String[] nombres, String[] apellidos) {
			
		Random random = new Random();
		int index2 = random.nextInt(apellidos.length);
		String apellidoAleatorio = apellidos[index2];
		int index = random.nextInt(nombres.length);
		String nombreAleatorio = nombres[index];
		
		String nombreCompleto = (nombres[index] + " " + apellidos[index2]);
		
		return nombreCompleto;
		
	}
	
	public static String nombreApellidoAleatorio() {
		
		return nombreApellidoAleatorio(NOMBRES,APELLIDOS);
		
//		Random random = new Random();
//		int index2 = random.nextInt(APELLIDOS.length);
//		String apellidoAleatorio = APELLIDOS[index2];
//		int index = random.nextInt(NOMBRES.length);
//		String nombreAleatorio = NOMBRES[index];
//		
//		String nombreCompleto = (NOMBRES[index] + " " + APELLIDOS[index2]);
		
	}
	
	public static String nombreAleatorio() {
		
		Random random = new Random();
		
		int index = random.nextInt(NOMBRES.length);
		String nombreAleatorio = NOMBRES[index];
		
		return nombreAleatorio;
	}
	
	public static int numeroAleatorio() {
		
		Random numeros = new Random();
		
		int numeroAleatorio = numeros.nextInt(500);
		
		return numeroAleatorio;
	}
	
}
