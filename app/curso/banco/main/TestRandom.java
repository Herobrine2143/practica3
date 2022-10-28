package app.curso.banco.main;

import java.util.ArrayList;
import java.util.Random;

import app.curso.banco.util.Utiles;

public class TestRandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i <= 10; ++i) {
			String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
			System.out.println("\n" + nombreAleatorio);
			}
		System.out.println("\n###########");
		for (int i = 0; i <= 20; ++i) {
			String nombreAleatorio = Utiles.nombreAleatorio();
			System.out.println("\n" + nombreAleatorio);
			
		}
	}

}
