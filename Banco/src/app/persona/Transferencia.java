package app.persona;

import java.sql.Timestamp;
import java.util.Date;

import app.persona.Cliente;

public class Transferencia {
	private int idOrdenante;
	private int idBeneficiario;
	private double importe;
	private String concepto;
	private Timestamp fecha;
	
	public Transferencia(int idOrdenante, int idBeneficiario, double importe, String concepto) {
		this.idOrdenante = idOrdenante;
		this.idBeneficiario = idBeneficiario;
		this.importe = importe;
		this.concepto = concepto;
		this.fecha = new Timestamp(new Date().getTime());
		
	}
	
	public void mostrarTransferencias() {
		
		System.out.println("ID del Ordenante: " + this.idOrdenante);
		System.out.println("ID del Beneficiario: " + this.idBeneficiario);
		System.out.println("Importe: " + this.importe + " €");
		System.out.print("Concepto: " + this.concepto);
		System.out.println("Fecha: " + this.fecha);
		
	}

	public int getIdOrdenante() {
		return idOrdenante;
	}

	public void setIdOrdenante(int idOrdenante) {
		this.idOrdenante = idOrdenante;
	}

	public int getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(int idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
}
