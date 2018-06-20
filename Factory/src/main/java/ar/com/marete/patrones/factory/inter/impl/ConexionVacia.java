package ar.com.marete.patrones.factory.inter.impl;

import ar.com.marete.patrones.factory.inter.IConexion;

public class ConexionVacia implements IConexion{

	@Override
	public void conectar() {
		System.out.println("No se especifico ningun conector");
	}

	@Override
	public void desconectar() {
		System.out.println("No se especifico ningun conector");
	}

}
