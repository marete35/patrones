package ar.com.marete.MVC.controller;

import ar.com.marete.MVC.modelo.Cliente;
import ar.com.marete.MVC.view.ClienteView;

public class ClienteController {
	
	//objetos vista y modelo
	private ClienteView vista;
	private Cliente modelo;

	//Constructor para inicializar el modelo y la vista
	public ClienteController(Cliente modelo, ClienteView vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public ClienteView getVista() {
		return vista;
	}
	
	public void setVista(ClienteView vista) {
		this.vista = vista;
	}
	
	public Cliente getModelo() {
		return modelo;
	}
	
	public void setModelo(Cliente modelo) {
		this.modelo = modelo;
	}
	
	//pasa el modelo a la vista para presentar los datos.
	public void actualizarVista() {
		vista.imprimirDatosCliente(modelo.getId(), modelo.getNombre(), modelo.getApellido());
	}
	
	
}
