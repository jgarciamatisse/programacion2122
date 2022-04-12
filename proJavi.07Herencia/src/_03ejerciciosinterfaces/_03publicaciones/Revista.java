package _03ejerciciosinterfaces._03publicaciones;

public class Revista extends Publicacion {
	private int numero;
	
	public Revista(String codigo, String titulo, int anyo, int numero) {
		super(codigo, titulo, anyo);
		this.numero = numero;
	}

}
