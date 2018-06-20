package ar.com.marete.MVC;

import ar.com.marete.MVC.controller.ClienteController;
import ar.com.marete.MVC.modelo.Cliente;
import ar.com.marete.MVC.view.ClienteView;

/**
 * Hello world!
 *
 */
public class App{
	
    public static void main( String[] args ){
        //objeto vista, y el modelo creado por el metodo estatico
    	Cliente modelo = llenarDatosClientes();
    	ClienteView vista = new ClienteView();
    	
    	//se crea un objeto controlador y se le pasa el modelo y la vista
    	ClienteController  controlador =  new ClienteController(modelo, vista);
    	
    	//se muestra los datos del cliente
    	controlador.actualizarVista();
    	
    	//se actualiza un cliente y se muestra de nuevo los datos.
    	modelo.setNombre("Luis");
    	controlador.actualizarVista();
    }
    
    private static Cliente llenarDatosClientes() {
    	Cliente cliente = new Cliente();
    	cliente.setId(1);
    	cliente.setNombre("Elivar");
    	cliente.setApellido("Largo");
    	return cliente;
    }
}
