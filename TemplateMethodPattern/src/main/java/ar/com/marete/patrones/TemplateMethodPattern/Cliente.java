package ar.com.marete.patrones.TemplateMethodPattern;

public class Cliente extends Persona {
	
	private int numeroDeCliente;
	
	public Cliente (int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}

	@Override
	protected String getIdentificacion() {
		return String.valueOf(this.numeroDeCliente);
	}

	@Override
	protected String getTipoId() {
		return "numero de cliente";
	}
	
	public int getNumeroDeCliente() {
		return this.numeroDeCliente;
	}

	public void setNumeroDeCliente(int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}
}
