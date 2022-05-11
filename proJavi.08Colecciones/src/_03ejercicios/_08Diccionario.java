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
}
