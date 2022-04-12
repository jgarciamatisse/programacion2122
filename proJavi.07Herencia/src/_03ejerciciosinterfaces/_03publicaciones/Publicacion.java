package _03ejerciciosinterfaces._03publicaciones;

public class Publicacion {
	private String codigo;
	private String titulo;
	private int anyo;
	public Publicacion(String codigo,String titulo,int anyo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getAnyo() {
		return anyo;
	}
	@Override
	public String toString() {
		return "codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo;
	}
	
	
}
