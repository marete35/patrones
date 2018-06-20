package ar.com.marete.patrones.factory.inter.impl;

import ar.com.marete.patrones.factory.inter.IConexion;

public class ConexionOracle implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Oracle");
	}
	
	@Override
	public String toString() {
		return "ConexionMyOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="+ contrasena + "]";

	}

	
}
