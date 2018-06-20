package ar.com.marete.Command;

public class ArgentServer implements IServer {
	
	public void apagate() {
		System.out.println("Apagando el servidor de Argentina");
	}

	public void prendete() {
		System.out.println("Prendiendo el servidor de Argentina");
	}

	public void conectate() {
		System.out.println("Conectando al servidor de Argentina");
	}

	public void verificaConexion() {
		System.out.println("Comprobando la conexion de Argentina");
	}

	public void guardaLog() {
		System.out.println("Guardando los logs de la conexion de Argentina");
	}

	public void cerraConexion() {
		System.out.println("Cerrando la conexion de Argentina");
	}

}
