package ar.com.marete.patrones.Factory2;

public abstract class Triangulo {
	
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
	}
	
	public abstract String getDescripcion();
	public abstract double getSuperficie();
	public abstract void dibujate();
	
	private void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	
	private void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	
	private void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

}
