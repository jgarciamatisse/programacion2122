package _03ejerciciosinterfaces._03publicaciones;

public class Dvd extends Publicacion implements Prestable{
	private int duracion;
	private boolean prestado;
	
	public Dvd(String codigo, String titulo, int anyo, int duracion) {
		super(codigo, titulo, anyo);
		this.duracion = duracion;
		this.prestado = false;
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
