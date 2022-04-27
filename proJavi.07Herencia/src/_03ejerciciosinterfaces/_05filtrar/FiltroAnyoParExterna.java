package _03ejerciciosinterfaces._05filtrar;

import java.util.function.Predicate;

import _03ejerciciosinterfaces._03publicaciones.Publicacion;

public class FiltroAnyoParExterna implements Predicate<Publicacion> {

	@Override
	public boolean test(Publicacion p) {
		if(p.getAnyo() % 2 == 0) return true;
		else return false;
	}
}
