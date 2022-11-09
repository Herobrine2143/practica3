package app.persona;

import java.sql.Timestamp;
import java.util.Date;

//import app.persona.*;

public class Mensaje {
	
	private Timestamp fecha;
	private int idOrigen;
	private int idDestino;
	private String texto;
	
	public Mensaje(int idOrigen, int idDestino, String texto) {
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.texto = texto;
		this.fecha = new Timestamp(new Date().getTime());
	}
	
	public void mostrarMensajes() {
		
		System.out.println("Origen: " + this.idOrigen);
		System.out.println("Destino: " + this.idDestino);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Mensaje: \n\n" + this.texto);
		System.out.println("\n---------\n");
		
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(int idOrigen) {
		this.idOrigen = idOrigen;
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
