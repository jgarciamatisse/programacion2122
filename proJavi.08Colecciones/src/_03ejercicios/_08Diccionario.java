package _03ejercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class _08Diccionario {
	public static void main(String[] args) {
		Map<String,Set<String>> diccionario = new LinkedHashMap<>();
		System.out.println(anyadirTraduccion(diccionario, "casa","house")); //true
		System.out.println(anyadirTraduccion(diccionario, "casa","home"));	//true
		System.out.println(anyadirTraduccion(diccionario, "coche","car"));	//true
		System.out.println(anyadirTraduccion(diccionario, "coche","car"));	//false
		
		System.out.println(diccionario);

		quitarTraduccion(diccionario, "coche", "car");
		quitarTraduccion(diccionario, "casa", "house");
		
		System.out.println(diccionario);
		
		
	}
	public static boolean anyadirTraduccion(Map<String, Set<String>> m, String cast, String ingl) {
		
		Set<String> traducciones = m.get(cast);
		if(traducciones == null) {
			//nueva entrada en el diccionario
			traducciones = new TreeSet<>(); //creo el set de traducciones
			traducciones.add(ingl);			//añado la palabra en ingles
			
			m.put(cast, traducciones);		//Añadimos palabra y sus traducciones
			return true;
		} else {
			//ya hay una entrada para la palabra cast
//			if(traducciones.contains(ingl)) {
//				return false;
//			} else {
//				traducciones.add(ingl);
//				return true;
//			}
			return traducciones.add(ingl);
		}
		
	}
	public static boolean quitarTraduccion(Map<String, Set<String>> m, String cast, String ingl) {
		Set<String> traducciones = m.get(cast);
		if(traducciones == null) {
			//No tenemos la palabra cast en el diccionario
			return false;
		} else {
//			if(traducciones.contains(ingl)) {
//				traducciones.remove(ingl);
//				//Si se queda sin traducciones, eliminamos la pareja del map
//				if(traducciones.isEmpty()) {
//					m.remove(cast);
//				}
//				return true;
//			} else {
//				return false;
//			}
			//De otra forma
			boolean estaba = traducciones.remove(ingl);
			if(estaba && traducciones.isEmpty()) {
				m.remove(cast);
			}
			return estaba;
			
		}
	}
	
	public static Set<String> traduccionesDe (Map<String, Set<String>> m, String cast) {
		return m.get(cast);
	}
	
	public static boolean quitarTraducciones(Map<String, Set<String>> m, String cast) {
		if(m.containsKey(cast)) {
			m.remove(cast);
			return true;
		} else {
			return false;
		}
	}
}









