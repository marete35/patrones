package ar.com.marete.patrones.Factory2;

public class Escaleno extends Triangulo {

	public Escaleno(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy un triangulo Escaleno";
	}

	@Override
	public double getSuperficie() {
		return 0;
	}

	@Override
	public void dibujate() {
		//Algoritmo para dibujar.
	}

}
