package ar.com.marete.Command;

public class ApagarServer implements Command {
	
	private IServer servidor;
	
	public ApagarServer(IServer servidor) {
		this.servidor = servidor;
	}

	public void execute() {
		servidor.conectate();
		servidor.verificaConexion();
		servidor.guardaLog();
		servidor.apagate();
		servidor.cerraConexion();
	}
	
}
