package ar.com.marete.patrones.factory;

import ar.com.marete.patrones.factory.inter.IConexion;
import ar.com.marete.patrones.factory.inter.impl.ConexionMySQL;
import ar.com.marete.patrones.factory.inter.impl.ConexionOracle;
import ar.com.marete.patrones.factory.inter.impl.ConexionSQLServer;
import ar.com.marete.patrones.factory.inter.impl.ConexionVacia;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor) {
		if(motor == null) {
			return new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}
		else if(motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		}
		else if(motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}
		return new ConexionVacia();
	}

}
