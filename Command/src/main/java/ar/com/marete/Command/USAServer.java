package ar.com.marete.Command;

public class USAServer implements IServer {

	public void apagate() {
		System.out.println("Apagando el servidor de USA");
	}

	public void prendete() {
		System.out.println("Prendiendo el servidor de USA");
	}

	public void conectate() {
		System.out.println("Conectando al servidor de USA");
	}

	public void verificaConexion() {
		System.out.println("Comprobando la conexion de USA");
	}

	public void guardaLog() {
		System.out.println("Guardando los logs de la conexion de USA");
	}

	public void cerraConexion() {
		System.out.println("Cerrando la conexion de USA");
	}

}
