package _03ejercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class _02QuitarElementos {
	public static void main(String[] args) {
		TreeSet<String> l = 
				new TreeSet<>(Arrays.asList("casa","cosa","sopa","sorbo"));
		eliminarEmpezadosPor(l, "so");
		System.out.println(l);
	}
	
	public static void eliminarEmpezadosPor(Collection<String> c, String prefijo) {
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			String elemento = it.next();
			if(elemento.startsWith(prefijo)) {
				it.remove();
			}
//			//o bien
//			if(elemento.indexOf(prefijo) == 0) {
//				it.remove();
//			}
//			//o bien
//			if(elemento.substring(0, Math.min(prefijo.length(), elemento.length())).equals(prefijo)) {
//				it.remove();
//			}
		}
	}
}
