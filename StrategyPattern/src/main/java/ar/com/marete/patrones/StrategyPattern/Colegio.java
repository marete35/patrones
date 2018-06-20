package ar.com.marete.patrones.StrategyPattern;

import java.util.ArrayList;

public class Colegio {

	private ArrayList<Alumno> alumnos;
	private IListadoStrategy lista;
	
	public Colegio() {
		alumnos = new ArrayList<Alumno>();
		Alumno a1 = new Alumno("Juan",10);
		Alumno a2 = new Alumno("Sebastian",9.5);
		Alumno a3 = new Alumno("Mario",9);
		Alumno a4 = new Alumno("Pedro",8.5);
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
	}
	
	public ArrayList<Alumno> getAlumnos(){
		return alumnos;
	}
	
	public void setPersonas(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
