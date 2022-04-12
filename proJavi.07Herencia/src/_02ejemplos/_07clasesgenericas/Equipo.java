package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class Equipo <T> {
	private String nombre;
	private ArrayList<T> plantilla;
	private T capitan;

	public Equipo(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(T f) {
		if (!plantilla.contains(f)) {
			plantilla.add(f);
			if (capitan == null) {
				capitan = f;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean eliminar(T f) {
		boolean estaba = plantilla.remove(f);
		if (estaba) {
			if (capitan.equals(f)) {
				if (plantilla.size() > 0) {
					capitan = plantilla.get(0);
				} else {
					capitan = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		String res = nombre + "\nCapitan: " + capitan ;
		for(T f: plantilla) {
			res += "\n" + f;
		}
		return res;
	}
	
	public T getCapitan() {
		return capitan;
	}
}
