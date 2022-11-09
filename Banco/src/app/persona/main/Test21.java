package app.persona.main;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import app.persona.Cliente;
import app.persona.Gestor;
import app.persona.Mensaje;
import app.persona.Transferencia;
import app.persona.util.Database;
import app.persona.util.Generador;

public class Test21 {

	public static void main(String[] args) {
		Database database = new Database();
		//ArrayList<Gestor> gestores; 
		// \n= database.getGestores();
		
		//System.out.println(gestores);
		
//		Gestor gestor = new Gestor("gestor2","", "gestor2@correo.com");
//		database.insertarGestor(gestor);
		
		//database.getGestores();
		
//		boolean gestorBorrado = database.borrarGestor(153);
//		
//		if (gestorBorrado) {
//			System.out.println("Borrado");
//		} else {
//			System.out.println("No");
//		}
		
		//ArrayList<Cliente> clientes;
		
		//Cliente cliente = new Cliente(154);
		//database.insertarCliente(cliente);
		
		//database.getClientes();
		//System.out.println(clientes);
		
		Date fecha = new Date();
		long ms = fecha.getTime();
		
		database.mostrarGestores();
		database.mostrarClientes();
		//database.mostrarMensajes();
		//database.saldoCliente(100, 2);
		database.mostrarClientes();
		
		//Cliente cliente = new Cliente(155);
		
		//Transferencia transferencia = new Transferencia(1,4,20.12d,"Por tus problemas");
		//database.enviarTransferencia(transferencia);
		database.mostrarTransferencias();
		
		//System.out.println("Fecha em milisegundos: " + ms);
		
		//Timestamp datetime = new Timestamp(new Date().getTime());
		//System.out.println("Fecha: " + datetime);
		
//		Mensaje mensaje = new Mensaje(156,154,"Me recuerdas?");
//		database.enviarMensaje(mensaje);
//		mensaje.mostrarMensajes();
		
		}

	}