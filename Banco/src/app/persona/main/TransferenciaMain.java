package app.persona.main;

import app.movimiento.Transferencia;
import app.persona.Cliente;
import app.persona.util.Database;

public class TransferenciaMain {

	public static void main(String[] args) {

		Database database = new Database();

		System.out.println("Antes de la transferencia: \n");
		database.mostrarClientes();
		
		// Crea una nueva transferencia
		Transferencia transferencia = new Transferencia(4, 1, 250d, "From Toby to Stelea");

		boolean e = database.enviarTransferencia(transferencia);

		Cliente cliente = database.getClientes(transferencia.getIdOrdenante());

		double x = (cliente.getSaldo() - transferencia.getImporte());

		Cliente cliente1 = database.getClientes(transferencia.getIdBeneficiario());

		double y = (cliente1.getSaldo() + transferencia.getImporte());

		database.restaTransferencia(e, x, 4);
		database.sumaTransferencia(e, y, 1);

		System.out.println("Despues de la transferencia: \n");
		database.mostrarClientes();

	}

}
