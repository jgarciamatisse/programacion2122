package _03ejerciciosinterfaces._03publicaciones;

import java.util.ArrayList;

public class TestPublicaciones {
	public static void main(String[] args) {
		ArrayList<Publicacion> misPublicaciones = new ArrayList<>();
		misPublicaciones.add(new Libro("a1", "Introduccion java", 2020));
		misPublicaciones.add(new Dvd("a2", "Consejos programación", 2020, 60));

		// Recorrido que muestra los títulos
		for (Publicacion p : misPublicaciones) {
			System.out.println(p.getTitulo());
		}

		// Recorrido que cuente cuantos están prestados
		int cont = 0;
		for (Publicacion p : misPublicaciones) {
			if (((Prestable) p).getPrestado() /* == true */ ) {
				cont++;
			}
		}
		System.out.println("Prestadas: " + cont);

		// Otra alternativa -------------------------
		ArrayList<Prestable> misPrestables = new ArrayList<>();
		misPrestables.add(new Libro("a1", "Introduccion java", 2020));
		misPrestables.add(new Dvd("a2", "Consejos programación", 2020, 60));

		// Recorrido que muestra los títulos
		for (Prestable p : misPrestables) {
			System.out.println(((Publicacion)p).getTitulo());
		}

		// Recorrido que cuente cuantos están prestados
		cont = 0;
		for (Prestable p : misPrestables) {
			if (p.getPrestado() /* == true */ ) {
				cont++;
			}
		}
		System.out.println("Prestadas: " + cont);
	}
}
