package ar.com.marete.patrones.Factory2;

public class TrianguloFactory {

	public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
		if((ladoA == ladoB) && (ladoA == ladoC)) {
			return new Equilatero(ladoA, ladoB, ladoC);
		}else if((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
			return new Escaleno(ladoA, ladoB, ladoC);
		}else {
			return new Isosceles(ladoA, ladoB,ladoC);
		}
	}
}
