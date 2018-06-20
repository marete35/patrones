package ar.com.marete.State;

public class Persona {

	private String nombre;
	private ISaludState salud;
	
	public Persona() {
		this.salud = new Saludable();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ISaludState getSalud() {
		return salud;
	}
	
	public void setSalud(ISaludState salud) {
		this.salud = salud;
	}
	
	public void estoyBien() {
		salud = new Saludable();
	}
	
	public void dolorDeCabeza() {
		salud = new DolorDeCabeza();
	}
	
	public void dolorDePanza() {
		salud = new DolorDePanza();
	}
	
	public String comoTeSentis() {
		return salud.comoTeSentis();
	}
	
}
