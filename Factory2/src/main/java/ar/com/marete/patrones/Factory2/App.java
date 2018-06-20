package ar.com.marete.patrones.Factory2;

/**
 * Asumamos que tenes una clase Triangulo y necesitamos crear un tipo de triangulo: escaleno, isoceles o equilatero. 
 * Para ello, esta la clase abstracta Triangulo y sus clases hijas.
 *
 */
public class App 
{
    public static void main( String[] args ){
        TrianguloFactory factory = new TrianguloFactory();
        Triangulo triangulo = factory.createTriangulo(10, 10, 10);
        System.out.println(triangulo.getDescripcion());
    }
}
