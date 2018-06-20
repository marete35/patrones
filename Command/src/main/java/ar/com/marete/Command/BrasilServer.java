package ar.com.marete.Command;

public class BrasilServer implements IServer {

	public void apagate() {
		System.out.println("Apagando el servidor de Brasil");
	}

	public void prendete() {
		System.out.println("Prendiendo el servidor de Brasil");
	}

	public void conectate() {
		System.out.println("Conectando al servidor de Brasil");
	}

	public void verificaConexion() {
		System.out.println("Comprobando la conexion de Brasil");
	}

	public void guardaLog() {
		System.out.println("Guardando los logs de la conexion de Brasil");
	}

	public void cerraConexion() {
		System.out.println("Cerrando la conexion de Brasil");
	}

}
