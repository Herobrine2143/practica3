package app.persona.util;

//import java.util.ArrayList;
import java.util.Random;
//import app.curso.banco.main.TestRandom;

public class Generador {

//	static Random intNumbers = new Random();
//	static Random floatNumbers = new Random();
	// ArrayList<String> nombresCompletos = new ArrayList();

	public static final String[] NOMBRES = { "Alvaro", "Jose", "Juan", "Pedro", "Ana", "Sara", "Elena", "Isabel",
			"Carla", "Steven", "Carlos", "Jeff", "Tobi", "null", "Toby" };

	public static final String[] APELLIDOS = { "Pascal", "Mareno", "Francisco", "Talo", "Lopez", "Fatima", "de la Cruz",
			"Martinez", "Hawling", "Troya", "Spartanuss", "Fox" };

	public static final String[] NOMBRE_CORREO = { "aloha123875", "maribundo", "jorge21", "estela1", "alejandro13",
			"megatron198" };

	public static final String[] TIPO_CORREO = { "hotmail.com", "gmail.com", "yahoo.com" };

//	public static float MIN = 500;
//	public static float MAX = 10000;

	public static String nombreApellidoAleatorio(String[] nombres, String[] apellidos) {

		Random random = new Random();
		int index2 = random.nextInt(apellidos.length);
//		String apellidoAleatorio = apellidos[index2];
		int index = random.nextInt(nombres.length);
//		String nombreAleatorio = nombres[index];

		String nombreCompleto = (nombres[index] + " " + apellidos[index2]);

		return nombreCompleto;

	}

	public static String correoElectronico(String[] nombre_correo, String[] tipo_correo) {
		Random ncorreo = new Random();
		int nIndex = ncorreo.nextInt(nombre_correo.length);
		int nIndex1 = ncorreo.nextInt(tipo_correo.length);

		String correoCompleto = (nombre_correo[nIndex] + "@" + tipo_correo[nIndex1]);

		return correoCompleto;
	}

	public static String correoElectronico() {
		return correoElectronico(NOMBRE_CORREO, TIPO_CORREO);
	}

	public static String nombreApellidoAleatorio() {

		return nombreApellidoAleatorio(NOMBRES, APELLIDOS);

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

	public static float numeroDecimalAleatorio() {

//		Random numero = new Random();

		float x = (float) Math.random() * (700f - 200f + 1) + 500f;

		return x;

	}

}
