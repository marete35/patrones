package ar.com.marete.Command;

/**
 * Escenario: una empresa maneja varios servidores y cada uno de ellos deben correr diversos procesos, como apagarse, prenderse, etc. 
 * Cada uno de estos procesos, a su vez, implican pequeños pasos como, por ejemplo, realizar una conexion a dicho servidor, guardar
 * los datos  en un log. 
 *
 */
public class App{
	
    public static void main( String[] args ){
    	IServer server = new ArgentServer();
    	Command command = new PrendeServer(server);
    	Invoker serverAdmin = new Invoker(command);
    	serverAdmin.run();
    }
}
