package ar.com.marete.patrones.Singleton;

/**
 * Thread safe Singleton.
 * @author Mario
 *
 */
public class Singleton {

	private static volatile Singleton instance;
	
	/**
	 * Para evitar instancia mediante el operador new. 
	 */
	private Singleton() {
	}

	/**
	 * Metodo que retorna la unica instancia de la clase. En caso que no exista se crea la primera vez. 
	 * @param value
	 * @return
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
					
				}
			}
		}
		return instance;
	}
	
}
