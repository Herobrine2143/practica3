package app.curso.banco.entidad;

public class Transferencia extends Mensaje {

	float transferirDinero;

	public Transferencia(int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje,
			float transferirDinero) {
		super(id, tipoEmisor, idEmisor, tipoReceptor, idReceptor, textoMensaje);
		this.transferirDinero = transferirDinero;
	}

	public float getTransferirDinero() {
		return transferirDinero;
	}

	public void setTransferirDinero(float transferirDinero) {
		this.transferirDinero = transferirDinero;
	}

	public String toString() {
		String texto = super.toString();
		texto += " Dinero: " + this.transferirDinero + " €";
		return texto;
	}

}
