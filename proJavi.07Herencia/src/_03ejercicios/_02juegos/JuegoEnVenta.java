package _03ejercicios._02juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta{
	
	public JuegoEnVenta(String titulo, String fabricante, int anyo, double precio, int copias) {
		super(titulo, fabricante, anyo,precio, copias);
	}
	
	
	public boolean vender() {
		return reducirCopias();
	}
}
