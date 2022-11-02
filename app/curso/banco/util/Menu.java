package app.curso.banco.util;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Gestor;

//import app.curso.banco.util.Utiles;
import java.util.Random;

public class Menu {
	public static void main(String[] args) {
		
		//Quitamos Usuario de Persona y en Login solo utilizamos contrase�a, Cliente ClienteParLOgin = clientes.get(idCliente) boolean loginCorrecto = clienteparaLogin.getPassword().equals(pass)
		//en el numero 19 creamos una opcion para registro una variable int y haciendo un setPassowrd

		HashMap<String, Integer> listaGestores = new HashMap<>();

		Scanner keyboard = new Scanner(System.in);
		int numero;
		System.out
				.println("1. Inserci�n de un gestor.\r\n" + "2. Inserci�n masiva de gestores con datos aleatorios.\r\n"
						+ "3. Obtenci�n de un gestor.\r\n" + "4. Obtenci�n de todos los gestores.\r\n"
						+ "5. Actualizaci�n de un gestor.\r\n" + "6. Eliminaci�n de un gestor.\r\n"
						+ "7. Inserci�n de un cliente.\r\n" + "8. Obtenci�n de un cliente.\r\n"
						+ "9. Obtenci�n de todos los clientes.\r\n" + "10. Actualizaci�n de un cliente.\r\n"
						+ "11. Eliminaci�n de un cliente.\r\n" + "12. Obtenci�n de un mensaje.\r\n"
						+ "13. Obtenci�n de todos los mensajes.\r\n" + "14. Env�o de un mensaje.\r\n"
						+ "15. Obtenci�n de una transferencia.\r\n" + "16. Obtenci�n de todas las trasferencias\r\n"
						+ "17. Env�o de una transferencia.\r\n" + "18. Login y registro.");
		System.out.print("\nIntroduce algo: ");

		do {
			numero = keyboard.nextInt();
			switch (numero) {
			case 1:
				
				System.out.println("\n\nInserci�n de un gestor.\n");
				System.out.print("Nombre del Gestor: ");
				String nombre = keyboard.next();
				System.out.print("ID: ");
				int id = keyboard.nextInt();
				listaGestores.put(nombre, id);

				System.out.println("\nCreado\n");
				break;

			case 2:

				System.out.print("Cantidad de Gestores aleatorios que quieres crear: ");
				int cantidad = keyboard.nextInt();
				System.out.println(cantidad);
				for (int i = 0; i < cantidad; i++) {
					nombre = Utiles.nombreAleatorio();
					id = Utiles.numeroAleatorio();
					System.out.println(id);
					listaGestores.put(nombre, id);
				}

				listaGestores.forEach((nombres, ids) -> {
					System.out.println("> " + nombres + " " + ids);
				});

				break;
			case 3:
				System.out.print("Que gestor quieres obtener? ");
				nombre = keyboard.next();
				
				int buscar = listaGestores.get(nombre);
				//int test = listaGestores.get("Isabel");
				System.out.println("\n" + buscar);
				break;
			case 4:
				listaGestores.forEach((nombres, ids) -> {
					System.out.println("> " + nombres + " " + ids);
				});
				break;
			case 5:
				System.out.println("\n5. Actualizaci�n de un gestor.\r\n");
				break;
			case 6:
				System.out.println("\n6. Eliminaci�n de un gestor.\r\n");
				break;
			case 7:
				System.out.println("\n7. Inserci�n de un cliente.\r\n");
				break;
			case 8:
				System.out.println("\n8. Obtenci�n de un cliente.\r\n");
				break;
			case 9:
				System.out.println("\n9. Obtenci�n de todos los clientes.\r\n");
				break;
			case 10:
				System.out.println("\n10. Actualizaci�n de un cliente.\r\n");
				break;
			case 11:
				System.out.println("11. Eliminaci�n de un cliente.\r\n");
				break;
			case 12:
				System.out.println("12. Obtenci�n de un mensaje.\r\n");
				break;
			case 13:
				System.out.println("13. Obtenci�n de todos los mensajes.\r\n");
				break;
			case 14:
				System.out.println("14. Env�o de un mensaje.\r\n");
				break;
			case 15:
				System.out.println("15. Obtenci�n de una transferencia.\r\n");
				break;
			case 16:
				System.out.println("16. Obtenci�n de todas las trasferencias\r\n");
				break;
			case 17:
				System.out.println("17. Env�o de una transferencia.\r\n");
				break;
			case 18:
				System.out.println("18. Login y registro.");
				break;
			case 19:
				System.out.println("\n\nSaliendo...");
				break;
			default:
				System.out.println("\nOpcion no existente...");
				break;
			}
			if (numero != 20) {
				System.out.println("1. Inserci�n de un gestor.\r\n"
						+ "2. Inserci�n masiva de gestores con datos aleatorios.\r\n" + "3. Obtenci�n de un gestor.\r\n"
						+ "4. Obtenci�n de todos los gestores.\r\n" + "5. Actualizaci�n de un gestor.\r\n"
						+ "6. Eliminaci�n de un gestor.\r\n" + "7. Inserci�n de un cliente.\r\n"
						+ "8. Obtenci�n de un cliente.\r\n" + "9. Obtenci�n de todos los clientes.\r\n"
						+ "10. Actualizaci�n de un cliente.\r\n" + "11. Eliminaci�n de un cliente.\r\n"
						+ "12. Obtenci�n de un mensaje.\r\n" + "13. Obtenci�n de todos los mensajes.\r\n"
						+ "14. Env�o de un mensaje.\r\n" + "15. Obtenci�n de una transferencia.\r\n"
						+ "16. Obtenci�n de todas las trasferencias\r\n" + "17. Env�o de una transferencia.\r\n"
						+ "18. Login y registro.");
				System.out.print("\nIntroduce algo: ");
			}
		} while (numero != 19);
		keyboard.close();
	}
}