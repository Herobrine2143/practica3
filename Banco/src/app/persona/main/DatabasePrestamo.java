package app.persona.main;

import app.movimiento.Prestamo;
import app.movimiento.PrestamoRelacion;
import app.persona.util.Database;

public class DatabasePrestamo {

	public static void main(String[] args) {
		Database database = new Database();
		
		Prestamo prestamo = new Prestamo("Carlos",240d,12);
		database.pedirPrestamo(prestamo);
		
		PrestamoRelacion prestamoRel = new PrestamoRelacion(prestamo.getId(),1);
		//PrestamoRelacion prestamoRel = database.getPrestamoRelacion(prestamo.getId());
		database.prestamoRelacion(prestamoRel);
		
		database.mostrarPrestamos();
		database.mostrarPrestRelacion();

	}

}
