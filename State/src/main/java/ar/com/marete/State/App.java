package ar.com.marete.State;

/**
 * Hello world!
 *
 */
public class App{
	
    public static void main( String[] args ){
    	Persona p = new Persona();
    	p.setNombre("Juan");
    	System.out.println(p.comoTeSentis());
    	p.dolorDeCabeza();
    	System.out.println(p.comoTeSentis());
    }
}
