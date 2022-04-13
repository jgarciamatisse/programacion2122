package _03ejerciciosinterfaces._05filtrar;

import java.util.ArrayList;
import java.util.function.Predicate;

import _03ejerciciosinterfaces._03publicaciones.Libro;
import _03ejerciciosinterfaces._03publicaciones.Publicacion;
import _03ejerciciosinterfaces._03publicaciones.Revista;

public class Filtrar {
	public static void main(String[] args) {
		ArrayList<Publicacion> l = new ArrayList<>();
		l.add(new Revista("R3", "Caza y pesca", 2015, 1));
		l.add(new Revista("R2", "Caza y pesca", 2015, 2));
		l.add(new Libro("L1", "Dejar de fumar", 2000));
		l.add(new Libro("L2", "Recetas faciles", 2002));
		
		//Mostrar publicaciones cuyo año es par
		mostrarPubFiltradas(l,p -> p.getAnyo()%2 == 0);
		//Mostrar las publicaciones cuyo título tiene una longitud mayor que 5
		mostrarPubFiltradas(l,p -> p.getTitulo().length() > 5);
		
		//Mostrar las publicaciones del año actual
		
		//Mostrar las publicaciones cuyo año está entre 2000 y 2005 y cuyo título
		// contiene la palabra “casa”.
		
		//Mostrar las publicaciones que son libros
	}
	
	public static void mostrarPubFiltradas(ArrayList<Publicacion> l, Predicate<Publicacion> pred ) {
		for(Publicacion p: l) {
			if(pred.test(p)) {
				System.out.println(p);
			}
		}
		
	}
}
