package app.movimiento;

public class PrestamoRelacion {

	private int idPrestamo;
	private int idCliente;

	public PrestamoRelacion(int idPrestamo, int idCliente) {
		this.idPrestamo = idPrestamo;
		this.idCliente = idCliente;
	}

	public PrestamoRelacion() {

	}

	public void mostrarPrestamoRelacion() {
		System.out.println("ID del prestamo: " + this.idPrestamo);
		System.out.println("ID del Cliente: " + this.idCliente);
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
