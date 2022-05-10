package _03ejercicios;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _03OperacionesMasivas {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(interseccion(new Integer[] {1,2,3}, new Integer[] {3,4,5})));
	}
	public static Integer[] quitarDuplicados(Integer[] v) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(v));
		return s.toArray(new Integer[0]);
	}
	public static int[] quitarDuplicados(int[] v) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		//Añadimos al set para quitar duplicados
		for(int i = 0; i < v.length; i++) {
			s.add(v[i]);
		}
		
		//Volcamos el set a un array de int
		int[] result = new int[s.size()];
		int i = 0;
		for(Integer x: s) {
			result[i] = x;
			i++;
		}
		return result;
	}
	//Union
	public static Integer[] union(Integer[] v1, Integer[] v2) {
		//Creo el set con los elementos de v1
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(v1));
		//Añado los elementos de v2
		s.addAll(Arrays.asList(v2));
		
		//Devolvemos el set transformado en array
		return s.toArray(new Integer[0]);
	}
	
	public static int[] union(int[] v1, int[] v2) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		//Añadimos v1 al set para quitar duplicados
		for(int i = 0; i < v1.length; i++) {
			s.add(v1[i]);
		}
		//Añadimos v1 al set para quitar duplicados
		for(int i = 0; i < v2.length; i++) {
			s.add(v2[i]);
		}
		
		//Volcamos el set a un array de int
		int[] result = new int[s.size()];
		int i = 0;
		for(Integer x: s) {
			result[i] = x;
			i++;
		}
		return result;
	}
	
	//Intersección
	public static Integer[] interseccion(Integer[] v1, Integer[] v2) {
		//Creo el set con los elementos de v1
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(v1));
		//Añado los elementos de v2
		s.retainAll(Arrays.asList(v2));
		
		//Devolvemos el set transformado en array
		return s.toArray(new Integer[0]);
	}
	
	public static int[] interseccion(int[] v1, int[] v2) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		//Añadimos v1 al set para quitar duplicados
		for(int i = 0; i < v1.length; i++) {
			s1.add(v1[i]);
		}
		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		//Añadimos v2 al set para quitar duplicados
		for(int i = 0; i < v2.length; i++) {
			s2.add(v2[i]);
		}
		
		s1.retainAll(s2);
		
		//Volcamos el set a un array de int
		int[] result = new int[s1.size()];
		int i = 0;
		for(Integer x: s1) {
			result[i] = x;
			i++;
		}
		return result;
	}
	//Diferencia
	public static Integer[] diferencia(Integer[] v1, Integer[] v2) {
		//Creo el set con los elementos de v1
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(v1));
		//Añado los elementos de v2
		s.removeAll(Arrays.asList(v2));
		
		//Devolvemos el set transformado en array
		return s.toArray(new Integer[0]);
	}
	public static int[] diferencia(int[] v1, int[] v2) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		//Añadimos v1 al set para quitar duplicados
		for(int i = 0; i < v1.length; i++) {
			s1.add(v1[i]);
		}
		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		//Añadimos v2 al set para quitar duplicados
		for(int i = 0; i < v2.length; i++) {
			s2.add(v2[i]);
		}
		
		s1.removeAll(s2);
		
		//Volcamos el set a un array de int
		int[] result = new int[s1.size()];
		int i = 0;
		for(Integer x: s1) {
			result[i] = x;
			i++;
		}
		return result;
	}
}







