package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona {

	private float totalDinero;
	// public float dineroAntes;
	private HashMap<String, Float> cuentas;

	public HashMap<String, Float> getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashMap<String, Float> cuentas) {
		this.cuentas = cuentas;
	}

	//public Cliente() {

	//}
	
	public Cliente(int id, String nombre, String telefono) {
		super(id, nombre, telefono);
		this.totalDinero = 0;
		this.cuentas = new HashMap<>();
	}
	
	public Cliente(int id) {
		super(id);
		this.totalDinero = 0;
		this.cuentas = new HashMap<>();
	}

	public Cliente(int id, String nombre, String telefono, float totalDinero) {
		super(id, nombre, telefono);
		this.totalDinero = totalDinero;
	}

	public float getTotalDinero() {
		return this.totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Dinero Total: " + totalDinero + " €");
		// if (totalDinero != dineroAntes) System.out.print(" (" + dineroAntes + ")");
		System.out.println("\n--------");
	}

	public float ingresarDinero(float ingresarDinero) {
		// this.totalDinero = this.dineroAntes;
		this.totalDinero += ingresarDinero;
		return ingresarDinero;
	}

	public float retirarDinero(float retirarDinero) {
		this.totalDinero -= retirarDinero;
		return retirarDinero;
	}

	public void abrirCuenta(String idCuenta, Float dinero) {
		this.cuentas.put(idCuenta, dinero);
		ingresarDinero(dinero);
	}

	public void mostrarCuenta() {
		cuentas.forEach((idCuenta, dinero) -> {
			System.out.println(idCuenta + " " + dinero);
		});
	}

	public void cerrarCuenta(String idCuenta) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		retirarDinero(idCuenta, dineroEnCuenta);
		this.cuentas.remove(idCuenta);
	}

	public float ingresarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (this.cuentas.get(idCuenta) != null) {
			this.cuentas.put(idCuenta, (dineroEnCuenta + dinero));
			ingresarDinero(dinero);
		} else {
			System.out.println("Cuenta no existe");
		}
		return this.totalDinero;
	}

	public float retirarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (this.cuentas.get(idCuenta) != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
			retirarDinero(dinero);
		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}
}
