package ar.com.marete.patrones.TemplateMethodPattern;

public abstract class Persona {
	
	private String nombre;
	private String DNI;
	
	public String identificate() {
		String frase = "Me identifico con : ";
		frase = frase + getTipoId();
		frase = frase + ". El numero es :";
		frase = frase + getIdentificacion();
		return frase;
	}

	//Define el esqueleto del algoritmo y luego las subclases
	//deben implementar los metodos:
	//getIdentificacion y getTipoId();
	protected abstract String getIdentificacion();
	
	protected abstract String getTipoId();
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String dni) {
		DNI = dni;
	}
	
}
