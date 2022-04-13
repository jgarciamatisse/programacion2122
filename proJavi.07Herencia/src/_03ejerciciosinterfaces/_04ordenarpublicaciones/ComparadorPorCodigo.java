package _03ejerciciosinterfaces._04ordenarpublicaciones;

import java.util.Comparator;

import _03ejerciciosinterfaces._03publicaciones.Publicacion;

public class ComparadorPorCodigo implements Comparator<Publicacion> {
	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		if(o1.getCodigo().compareTo(o2.getCodigo()) < 0) return -1;
		else if(o1.getCodigo().compareTo(o2.getCodigo()) > 0) return 1;
		else return 0;

		//return o1.getCodigo().compareTo(o2.getCodigo());
	}
}
