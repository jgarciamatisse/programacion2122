package _03ejercicios;

import java.util.Arrays;
import java.util.TreeSet;

public class _04Futbol {
	public static void main(String[] args) {
		String[] equipos = { "A", "B", "C", "D", "E" };
		String[][] partidos = { 
				{ "A", "B" }, 
				{ "A", "C" }, 
				{ "B", "A" }, 
				{ "B", "C" }
		};
		System.out.println(Arrays.toString(hanJugadoCasa(equipos, partidos)));
		System.out.println(Arrays.toString(noHanJugadoFuera(equipos, partidos)));

	}

	public static String[] hanJugadoCasa(String[] equipos, String[][] partidos) {
		TreeSet<String> casa = new TreeSet<>();

		for (int i = 0; i < partidos.length; i++) {
			casa.add(partidos[i][0]); // Añadimos al set elem. de la primera columna
		}
		// Devolvemos el set en forma de array
		return casa.toArray(new String[0]);
	}

	public static String[] noHanJugadoFuera(String[] equipos, String[][] partidos) {
		TreeSet<String> noFuera = new TreeSet<>(Arrays.asList(equipos));
		// Quitamos los que aparecen en la segunda columna
		for (int i = 0; i < partidos.length; i++) {
			noFuera.remove(partidos[i][1]);
		}
		// Devolvemos el set en forma de array
		return noFuera.toArray(new String[0]);
	}

}
