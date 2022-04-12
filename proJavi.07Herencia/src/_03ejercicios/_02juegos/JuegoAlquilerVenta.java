package _03ejercicios._02juegos;

public abstract class JuegoAlquilerVenta extends Juego{
	
	protected double precio;
	protected int copias;

	public JuegoAlquilerVenta(String titulo, String fabricante, int anyo, double precio, int copias) {
		super(titulo, fabricante, anyo);
		this.precio = precio;
		this.copias = copias;
	}
	
	public double getPrecio() {
		return precio;
	}

	public int getCopias() {
		return copias;
	}

	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	protected boolean reducirCopias() {
		if (copias > 0) {
			copias --;
			return true;
		} else {
			return false;
		}
	}

}
