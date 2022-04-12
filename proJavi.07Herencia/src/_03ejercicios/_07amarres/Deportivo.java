package _03ejercicios._07amarres;

public class Deportivo extends Barco{
	private double potencia;
	
	public Deportivo(String matricula, double eslora, int anyo, double potencia) {
		super(matricula, eslora, anyo);
		this.potencia = potencia;
	}
	public String toString() {
		return super.toString() + " - " + potencia + " caballos";
	}
	@Override
	public double getFactorAlquiler() {	
		return super.getFactorAlquiler() + potencia;
	}

}
