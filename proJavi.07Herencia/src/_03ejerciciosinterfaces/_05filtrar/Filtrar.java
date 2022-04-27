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
		l.add(new Libro("L2", "Casa", 2002));
		
		//Usando una clase externa
		mostrarFiltrado(l, new FiltroAnyoParExterna());

		//Usando clase interna
		mostrarFiltrado(l, new FiltroAnyoParInterna());
		
		//Usando clase anonima
		mostrarFiltrado(l, new Predicate<Publicacion> () {
			@Override
			public boolean test(Publicacion p) {
				if(p.getAnyo() % 2 == 0) return true;
				else return false;
			}
			
		});
		
		//Usando una expresión lambda
		mostrarFiltrado(l, 
				(p) -> { return p.getAnyo() % 2 == 0;}
		);
		
		//Usando una expresión lambda
		mostrarFiltrado(l, 
						p -> p.getAnyo() % 2 == 0
		);
	}
	
	public static void mostrarFiltrado(ArrayList<Publicacion> l, Predicate<Publicacion> pred) {
		for(Publicacion p: l) {
			if(pred.test(p)) {
				System.out.println(p);
			}
		}
	}
}
class FiltroAnyoParInterna implements Predicate<Publicacion> {

	@Override
	public boolean test(Publicacion p) {
		if(p.getAnyo() % 2 == 0) return true;
		else return false;
	}
	
}
