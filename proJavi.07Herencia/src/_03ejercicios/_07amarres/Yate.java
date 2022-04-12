package _03ejercicios._07amarres;

public class Yate extends Barco{
	private double potencia;
	private int camarotes;
	
	public Yate(String matricula, double eslora, int anyo, double potencia, int camarotes) {
		super(matricula, eslora, anyo);
		this.potencia = potencia;
		this.camarotes = camarotes;
	}
	public String toString() {
		return super.toString() + " - " + potencia + " caballos - " + camarotes + " camarotes";
	}
	
	@Override
	public double getFactorAlquiler() {	
		return potencia * camarotes;
	}


}
