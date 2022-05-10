package ejercicio3;

import java.security.PrivilegedActionException;

public class DeportistaInterno extends Deportista{
	private String regimen;
	public DeportistaInterno(String nombre, String dni, String deporte, String regimen) {
		super(nombre,dni,deporte);
		if(!regimen.equals("SOLO_ALOJAMIENTO") 
				&& !regimen.equals("ALOJAMIENTO+DESAYUNO") 
				&& !regimen.equals("PENSION_COMPLETA")) {
			throw new IllegalArgumentException("Regimen incorrecto");
		}
		this.regimen = regimen;
	}
	
	public String toString() {
		String textoPension;
		if(regimen.equals("SOLO_ALOJAMIENTO")) {
			textoPension = "Solo alojamiento";
		} else if(regimen.equals("ALOJAMIENTO+DESAYUNO")) {
			textoPension = "Media";
		} else {
			textoPension = "Completa";
		}
		return "INTERNO\n"  
				+ super.toString() 
				+ "\nPension: " + textoPension; 
				
	}

	@Override
	public double calcularImporteAPagar() {
		if(regimen.equals("SOLO_ALOJAMIENTO")) {
			return 300;
		} else if(regimen.equals("ALOJAMIENTO+DESAYUNO")) {
			return 500;
		} else {
			return 800;

		}
	}
}
