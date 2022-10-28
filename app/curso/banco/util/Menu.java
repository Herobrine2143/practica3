package app.curso.banco.util;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		HashMap<String, Integer> listaGestores = new HashMap<>();

		Scanner keyboard = new Scanner(System.in);
		int numero;
		System.out.println("1. Inserción de un gestor.\r\n" + 
				"2. Inserción masiva de gestores con datos aleatorios.\r\n" + 
				"3. Obtención de un gestor.\r\n" + 
				"4. Obtención de todos los gestores.\r\n" + 
				"5. Actualización de un gestor.\r\n" + 
				"6. Eliminación de un gestor.\r\n" + 
				"7. Inserción de un cliente.\r\n" + 
				"8. Obtención de un cliente.\r\n" + 
				"9. Obtención de todos los clientes.\r\n" + 
				"10. Actualización de un cliente.\r\n" + 
				"11. Eliminación de un cliente.\r\n" + 
				"12. Obtención de un mensaje.\r\n" + 
				"13. Obtención de todos los mensajes.\r\n" + 
				"14. Envío de un mensaje.\r\n" + 
				"15. Obtención de una transferencia.\r\n" + 
				"16. Obtención de todas las trasferencias\r\n" + 
				"17. Envío de una transferencia.\r\n" + 
				"18. Login y registro.");
		System.out.print("\nIntroduce algo: ");

		do {
			numero = keyboard.nextInt();
			switch (numero) {
			case 1:
				System.out.println("\n\nInserción de un gestor.\n");
				System.out.println("Nombre del Gestor");
				String nombre = keyboard.next();
				System.out.println("Dinero: ");
				int id = keyboard.nextInt();
				listaGestores.put(nombre, id);
				
				listaGestores.forEach((key, value) -> {
					System.out.println("> " + key + " " + value);
				});
				
				System.out.println("Creado");
				break;
			case 2:
				System.out.println("\nInserción masiva de gestores con datos aleatorios.\\r\\n\" + \r\n");
				break;
			case 3:
				System.out.println("\nObtención de un gestor.\r\n");
				break;
			case 4:
				System.out.println("\nObtención de todos los gestores.\r\n");
				break;
			case 5:
				System.out.println("\n5. Actualización de un gestor.\r\n");
				break;
			case 6:
				System.out.println("\n6. Eliminación de un gestor.\r\n");
				break;
			case 7:
				System.out.println("\n7. Inserción de un cliente.\r\n");
				break;
			case 8:
				System.out.println("\n8. Obtención de un cliente.\r\n");
				break;
			case 9:
				System.out.println("\n9. Obtención de todos los clientes.\r\n");
				break;
			case 10:
				System.out.println("\n10. Actualización de un cliente.\r\n");
				break;
			case 11:
				System.out.println("11. Eliminación de un cliente.\r\n");
				break;
			case 12:
				System.out.println("12. Obtención de un mensaje.\r\n");
				break;
			case 13:
				System.out.println("13. Obtención de todos los mensajes.\r\n");
				break;
			case 14:
				System.out.println("14. Envío de un mensaje.\r\n");
				break;
			case 15:
				System.out.println("15. Obtención de una transferencia.\r\n");
				break;
			case 16:
				System.out.println("16. Obtención de todas las trasferencias\r\n");
				break;
			case 17:
				System.out.println("17. Envío de una transferencia.\r\n");
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
			if (numero != 19) {
				System.out.println("1. Inserción de un gestor.\r\n" + 
						"2. Inserción masiva de gestores con datos aleatorios.\r\n" + 
						"3. Obtención de un gestor.\r\n" + 
						"4. Obtención de todos los gestores.\r\n" + 
						"5. Actualización de un gestor.\r\n" + 
						"6. Eliminación de un gestor.\r\n" + 
						"7. Inserción de un cliente.\r\n" + 
						"8. Obtención de un cliente.\r\n" + 
						"9. Obtención de todos los clientes.\r\n" + 
						"10. Actualización de un cliente.\r\n" + 
						"11. Eliminación de un cliente.\r\n" + 
						"12. Obtención de un mensaje.\r\n" + 
						"13. Obtención de todos los mensajes.\r\n" + 
						"14. Envío de un mensaje.\r\n" + 
						"15. Obtención de una transferencia.\r\n" + 
						"16. Obtención de todas las trasferencias\r\n" + 
						"17. Envío de una transferencia.\r\n" + 
						"18. Login y registro.");
				System.out.print("\nIntroduce algo: ");
			}
		} while (numero != 19);
		keyboard.close();
	}
}