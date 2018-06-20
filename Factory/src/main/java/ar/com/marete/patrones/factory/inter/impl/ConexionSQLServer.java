package ar.com.marete.patrones.factory.inter.impl;

import ar.com.marete.patrones.factory.inter.IConexion;

public class ConexionSQLServer implements IConexion{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "sqlServer";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de SQLServer");
	}
}
