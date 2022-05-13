package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<String> listaPalabras = new ArrayList<>(
				Arrays.asList(new String[] { "casa", "coche", "silla", "lampara" }));
		// Mostramos la lista original
		System.out.println(listaPalabras);
		// ------

		// COMPLETAR: Convertir todas las palabras de la lista a may�sculas usando el
		// m�todo Listas.modificarElementosLista
		// Con una clase interna
		Listas.modificarElementosLista(listaPalabras, new ModificadorAMayusculas());

		// Con una clase anónima
		Listas.modificarElementosLista(listaPalabras, new Modificador<String>() {
			@Override
			public String modificar(String s) {
				return s.toUpperCase();
			}

		});

		//Con una expresión lambda
		Listas.modificarElementosLista(listaPalabras, (s) -> {return s.toUpperCase();});
		
		//Otro ejemplo: Dejar cada elemento de la lista a longitud 1
		Listas.modificarElementosLista(listaPalabras, (s) -> {return s.substring(0,1);});
		
		
		
		
		// ------

		// Volvemos a mostrar la lista
		System.out.println(listaPalabras);
		// ------
	}
}

class ModificadorAMayusculas implements Modificador<String> {

	@Override
	public String modificar(String s) {
		return s.toUpperCase();
	}

}
