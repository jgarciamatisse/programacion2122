package _03ejercicios._02juegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta{
	
	protected int dias;
	public JuegoEnAlquiler(String titulo, String fabricante, int anyo, double precio, int copias, int dias) {
		super(titulo, fabricante, anyo, precio,copias);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public boolean alquilar() {
		return reducirCopias();
	}
	public void  devolver() {
		copias ++;
	}
}
