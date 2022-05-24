package _03ejerciciosinterfaces._01conjunto;

import java.util.ArrayList;

public class Conjunto <T> implements Coleccion<T> {
	private ArrayList<T> elementos;
	
	public Conjunto(){
		elementos = new ArrayList<>();
	}
	
	@Override
	public void agregar(T x) {
		if(!elementos.contains(x)){
			elementos.add(x);
		}
	}

	@Override
	public void eliminar(T x) {
		elementos.remove(x);
	}

	@Override
	public boolean estaVacia() {
		return elementos.isEmpty();
		//return elementos.size() == 0;
		//return talla() == 0;
	}

	@Override
	public int talla() {
		return elementos.size();
	}

	@Override
	public boolean contiene(T x) {
		return elementos.contains(x);
	}
	
	@Override
	public String toString(){
		String result = "";
		for(T x: elementos){
			result += x.toString() + "\n";
		}
		return result;
		//return elementos.toString();
	}

}
