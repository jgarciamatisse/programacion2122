package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class EquipoObjetos {
	private String nombre;
	private ArrayList<Object> plantilla;
	private Object capitan;

	public EquipoObjetos(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(Object f) {
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

	public boolean eliminar(Object f) {
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
		for(Object f: plantilla) {
			res += "\n" + f;
		}
		return res;
	}
	public Object getCapitan() {
		return capitan;
	}
}
