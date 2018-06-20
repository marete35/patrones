package ar.com.marete.patrones.StrategyPattern;

public class Alumno {
	
	private String nombre;
	private double promedio;

	public Alumno(String nombre, double promedio) {
		setNombre(nombre);
		setPromedio(promedio);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPromedio() {
		return promedio;
	}
	
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
