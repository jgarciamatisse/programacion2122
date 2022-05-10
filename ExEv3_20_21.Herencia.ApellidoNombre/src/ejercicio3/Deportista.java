package ejercicio3;

public abstract class Deportista {
	protected String nombre;
	private String dni;
	private String deporte;
	public Deportista(String nombre, String dni, String deporte) {
		this.nombre = nombre;
		this.dni = dni;
		this.deporte = deporte;
	}
	public String toString() {
		return "Nombre: " + nombre +
				"\nDNI: " + dni + 
				"\nDeporte: " + deporte;
	}
	public abstract double calcularImporteAPagar();
	
	public void mostrarRecibo() {
		System.out.println("NOMBRE: " + nombre);
		System.out.println("A PAGAR: " + calcularImporteAPagar());
	}

}
