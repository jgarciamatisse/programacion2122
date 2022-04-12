package _03ejercicios._02juegos;

public class Juego implements Comparable<Juego>{
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	public Juego(String titulo, String fabricante, int anyo) {
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = anyo;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if(!(o instanceof Juego)) return false;
		Juego j = (Juego)o;
		return this.titulo.equals(j.titulo) &&
				this.fabricante.equals(j.fabricante) &&
				this.anyo == j.anyo;
	}
	@Override
	public int compareTo(Juego j) {
		if(this.titulo.equals(j)) {
			if(this.fabricante.equals(j.fabricante)) {
				return this.anyo - j.anyo;
			} else {
				return this.fabricante.compareTo(j.fabricante);
			}
		} else {
			return this.titulo.compareTo(j.fabricante);
		}
	}
	
}
