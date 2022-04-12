package _03ejercicios._07amarres;

public class Velero extends Barco {
	private int mastiles;
	
	public Velero(String matricula, double eslora, int anyo, int mastiles) {
		super(matricula, eslora, anyo);
		this.mastiles = mastiles;
	}
	
	public String toString() {
		return super.toString() + " - " + mastiles + " mastiles";
	}

	@Override
	public double getFactorAlquiler() {
		return super.getFactorAlquiler() + mastiles;
	}

}
