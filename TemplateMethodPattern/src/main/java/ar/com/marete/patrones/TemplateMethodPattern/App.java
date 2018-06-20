package ar.com.marete.patrones.TemplateMethodPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Persona p = new Cliente(12121);
    	System.out.println("El cliente dice: ");
    	System.out.println(p.identificate());
    	
    	System.out.println("El empleado dice: ");
    	p = new Empleado("AD 32323");
    	System.out.println(p.identificate());
    	
    	System.out.println("El socio dice: ");
    	p = new Socio(23232);
    	System.out.println(p.identificate());
    }
}
