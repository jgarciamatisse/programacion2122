package _03ejerciciosinterfaces._04ordenarpublicaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import _03ejerciciosinterfaces._03publicaciones.Libro;
import _03ejerciciosinterfaces._03publicaciones.Publicacion;
import _03ejerciciosinterfaces._03publicaciones.Revista;

public class Ordenacion {
	public static void main(String[] args) {
		ArrayList<Publicacion> l = new ArrayList<>();
		l.add(new Revista("R3", "Caza y pesca", 2015, 1));
		l.add(new Revista("R2", "Caza y pesca", 2015, 2));
		l.add(new Libro("L1", "Dejar de fumar", 2000));
		l.add(new Libro("L2", "Recetas faciles", 2002));

		mostrarPorCodigo(l);
		mostrarPorTitulo(l);
		mostrarPorAnyo(l);
		mostrarPorAnyoDecreciente(l);
		System.out.println("---------------------------");
	}

	private static void mostrarPorCodigo(ArrayList<Publicacion> l) {
		// Ordenar la lista usando una clase externa que implementa
		// Comparator
		System.out.println("Por codigo -----------------");
		Collections.sort(l, new ComparadorPorCodigo());
		for (Publicacion p : l) {
			System.out.println(p);
		}

	}

	private static void mostrarPorTitulo(ArrayList<Publicacion> l) {
		// Ordenar la lista usando una clase interna (Nested class) que implementa
		// Comparator
		System.out.println("Por titulo -----------------");
		Collections.sort(l, new ComparadorPorTitulo());
		for (Publicacion p : l) {
			System.out.println(p);
		}
	}

	private static void mostrarPorAnyo(ArrayList<Publicacion> l) {
		// Ordenar la lista usando una clase anónima que implementa Comparator
		System.out.println("Por año -----------------");
		Collections.sort(l, new Comparator<Publicacion>() {
			public int compare(Publicacion p1, Publicacion p2) {
				if (p1.getAnyo() < p2.getAnyo())
					return -1;
				else if (p1.getAnyo() > p2.getAnyo())
					return 1;
				else
					return 0;

				// return p1.getAnyo() - p2.getAnyo();
			}
		});
		for (Publicacion p : l) {
			System.out.println(p);
		}
	}

	private static void mostrarPorAnyoDecreciente(ArrayList<Publicacion> l) {
		// Ordenar la lista usando una expresión lambda
		System.out.println("Por año decreciente -----------------");
		Collections.sort(l, (p1,p2)-> {
				if(p1.getAnyo() != p2.getAnyo())  
					return  p2.getAnyo() - p1.getAnyo();
				else if(!p1.getTitulo().equals(p2.getTitulo())) 
					return p1.getTitulo().compareTo(p2.getTitulo());
				else 
					return p1.getCodigo().compareTo(p2.getCodigo());
		});
		for (Publicacion p : l) {
			System.out.println(p);
		}
	}

}

class ComparadorPorTitulo implements Comparator<Publicacion> {
	@Override
	public int compare(Publicacion p1, Publicacion p2) {
		return p1.getTitulo().compareTo(p2.getTitulo());
	}
}
