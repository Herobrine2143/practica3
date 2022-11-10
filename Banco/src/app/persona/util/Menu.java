package app.persona.util;

import java.util.HashMap;

import app.movimiento.Mensaje;
import java.util.Scanner;

import app.persona.Persona;
import app.persona.Cliente;
import app.persona.Gestor;

//import app.curso.banco.util.Utiles;
import java.util.Random;

public class Menu {
	public static void main(String[] args) {

		// Quitamos Usuario de Persona y en Login solo utilizamos contrase�a, Cliente
		// ClienteParLOgin = clientes.get(idCliente) boolean loginCorrecto =
		// clienteparaLogin.getPassword().equals(pass)
		// en el numero 19 creamos una opcion para registro una variable int y haciendo
		// un setPassowrd

		HashMap<Integer, String> listaGestores = new HashMap<>();
		HashMap<Integer, String> listaClientes = new HashMap<>();
		Database database = new Database();
		Gestor gestor = new Gestor();
		Cliente cliente = new Cliente();

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
				String nombreGestor = keyboard.next();
				System.out.print("ID: ");
				int idGestor = keyboard.nextInt();
				// gestor = new Gestor();
				gestor.setNombre(nombreGestor);
				gestor.setId(idGestor);
				listaGestores.put(idGestor, nombreGestor);

				System.out.println("\nCreado\n");
				break;

			case 2:

				System.out.print("Cantidad de Gestores aleatorios que quieres crear: ");
				int cantidad = keyboard.nextInt();
				// gestor = new Gestor();
				// System.out.println(cantidad);
				for (int i = 0; i < cantidad; i++) {
					nombreGestor = Generador.nombreAleatorio();
					idGestor = Generador.numeroAleatorio(500);
					// System.out.println(id);
					listaGestores.put(idGestor, nombreGestor);
					gestor.setNombre(nombreGestor);
					gestor.setId(idGestor);
				}

				listaGestores.forEach((ids, nombres) -> {
					System.out.println(" > " + nombres + " " + ids);
				});

				break;
			case 3:
				System.out.print("Que gestor quieres obtener? ");
				idGestor = keyboard.nextInt();

				String buscar = gestor.getGestor(idGestor);
				// int test = listaGestores.get("Isabel");
				System.out.println("\n" + buscar);
				break;
			case 4:
				listaGestores.forEach((nombres, ids) -> {
					System.out.println("> " + nombres + " " + ids);
				});
				break;
			case 5:
				System.out.println("Actualizando Gestores...");
				boolean gestoresActualizados = database.actualizarGestores(gestor);
				if (gestoresActualizados == true) {
					System.out.println("Se han actualizado los gestores correctamente.");
				} else {
					System.out.println("No se han podido actualizar los gestores.");
				}
				break;
			case 6:
				System.out.print("\nIntroduze la id del Gestor que quieres eliminar: ");
				idGestor = keyboard.nextInt();
				database.borrarGestor(idGestor);
				break;
			case 7:
				System.out.println("\n\nInserci�n de un cliente.\n");
				System.out.print("Nombre del Cliente: ");
				String nombreCliente = keyboard.next();
				System.out.print("ID: ");
				int idCliente = keyboard.nextInt();
				cliente.setNombre(nombreCliente);
				cliente.setId(idCliente);
				listaClientes.put(idCliente, nombreCliente);
				boolean clientesActualizados = database.actualizarClientes(cliente);

				if (clientesActualizados == true) {
					System.out.println("\nCreado\n");
				} else {
					System.out.println("\nNo se pudo crear.\n");
				}
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
				System.out.print("\nID del mensaje: ");
				int idOrigen = keyboard.nextInt();
				System.out.print("\nTipo de Emisor: ");
				int idDestino = keyboard.next().charAt(0);
				System.out.print("\nMensaje a enviar: ");
				String texto = keyboard.next();
				Mensaje n1 = new Mensaje(idOrigen, idDestino, texto);
				System.out.println(n1);
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
				System.out.println("\nID del usuario: ");
				int newIdUsuario = keyboard.nextInt();
				System.out.println("\nContrase�a: ");
				String password = keyboard.next();
				break;
			case 19:
				System.out.print("\nID del usuario: ");
				int idUsuario = keyboard.nextInt();
				System.out.print("\nEstableze una contrase�a: ");
				String newPassword = keyboard.next();

				break;
			case -1:
				System.out.println("\n\nSaliendo...");
				break;
			default:
				System.out.println("\n            ######\n\n [!] Opcion no existente... [!]\n\n            ######\n");
				break;
			}
			if (numero != -1) {
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
		} while (numero != -1);
		keyboard.close();
	}
}