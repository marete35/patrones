package ar.com.marete.patrones.Factory2;

public class Equilatero extends Triangulo{

	public Equilatero(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy un triangulo Equilatero";
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujate() {
		//Algoritmo para dibujar. 
	}

}
