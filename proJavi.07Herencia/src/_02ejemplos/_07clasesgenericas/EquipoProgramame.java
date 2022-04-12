package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class EquipoProgramame {
	private String nombre;
	private ArrayList<Programador> plantilla;
	private Programador capitan;

	public EquipoProgramame(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(Programador f) {
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

	public boolean eliminar(Programador f) {
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
		for(Programador f: plantilla) {
			res += "\n" + f;
		}
		return res;
	}
	public Programador getCapitan() {
		return capitan;
	}
}
