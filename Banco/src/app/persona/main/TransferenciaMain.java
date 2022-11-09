package app.persona.main;

import app.persona.Cliente;
import app.persona.Transferencia;
import app.persona.util.Database;
import java.util.ArrayList;

public class TransferenciaMain {

	public static void main(String[] args) {
		Database database = new Database();
		ArrayList<Cliente> getClientes = new ArrayList<>();
		
		//System.out.println(z);
		
		//database.getClientes(true);
		double z = Double.valueOf(database.getClientes(false).get(1).getSaldo());
		double y = Double.valueOf(database.getClientes(false).get(2).getSaldo());
		Transferencia transferencia = new Transferencia(4,1,40d,"De prueba");
		database.enviarTransferencia(transferencia);
		double x = (z - transferencia.getImporte());
		double f = (y + transferencia.getImporte());
		
		//System.out.println("restante: " + x);
		
		database.restaTransferencia(database.enviarTransferencia(transferencia),x, 4);
		
		database.sumaTransferencia(database.enviarTransferencia(transferencia), f, 1);
	
		database.getClientes(false).forEach((cliente) -> {
			System.out.println(cliente.getSaldo());
		});
		
		
	}

}
