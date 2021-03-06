package ar.com.marete.patrones.factory.inter.impl;

import ar.com.marete.patrones.factory.inter.IConexion;

public class ConexionMySQL implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		super();
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public String toString() {
	 	return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena=" + contrasena + "]";

	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de MySQL");
	}
}
