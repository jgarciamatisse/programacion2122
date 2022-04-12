package _03ejerciciosinterfaces._03publicaciones;

public class Libro extends Publicacion implements Prestable{
	private boolean prestado;
	
	public Libro(String codigo, String titulo, int anyo) {
		super(codigo, titulo, anyo);
		prestado = false;
	}

	@Override
	public void prestar() {
		prestado = true;	
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean getPrestado() {
		return  prestado;
	}

	
}
