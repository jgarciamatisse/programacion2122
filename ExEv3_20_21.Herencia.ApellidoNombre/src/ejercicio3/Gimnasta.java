package ejercicio3;

public class Gimnasta extends DeportistaBecado{
	public Gimnasta(String nombre, String dni, String regimen) {
		super(nombre,dni,"Gimnasia deportiva",regimen,100);
	}
	public void mostrarRecibo() {
		System.out.println("NOMBRE: " + nombre);
		System.out.println("CUOTA GRATUITA");
	}
}
