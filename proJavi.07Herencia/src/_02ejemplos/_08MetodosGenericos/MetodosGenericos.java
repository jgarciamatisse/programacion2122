package _02ejemplos._08MetodosGenericos;

import _02ejemplos._02animales.Lobo;
import _02ejemplos._02animales.Mascota;
import _02ejemplos._03Tiempo.Tiempo;

public class MetodosGenericos {
	public static void main(String[] args) {
		String v[] = { "a", "a", "a", "a", "b", "b" };
		System.out.println(contarVeces(v, "a"));
		System.out.println(contarVeces(v, new Integer(20)));
		
		System.out.println("-----");
		System.out.println(mayor("a","b"));
		System.out.println(mayor(new Tiempo(11,20,30), new Tiempo(10,20,31)));
		
		// Si intentamos averiguar el mayor de dos perros, compila pero
		// se produce error de ejecución.
		//System.out.println(mayor(new Perro(), new Perro()));
		System.out.println(mayor2(new Lobo(), new Lobo()));
		
		// Si intentamos averiguar el mayor de dos perros, no compila 
		// porque el tipo <T> está restringido a objetos que implementen
		// comparable
		//System.out.println(mayor3(new Lobo(), new Lobo()));
		
		
		
		

	}

	// Devolver cuantas veces está x en el array de int v
	public static int contarVeces(int[] v, int x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				cont++;
			}
		}
		return cont;
	}

	// Devolver cuantas veces está x en el array de double v
	public static int contarVeces(double[] v, double x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				cont++;
			}
		}
		return cont;
	}

	// Devolver cuantas veces está x en el array de String v
//	public static int contarVeces(String[] v, String x) {
//		int cont = 0;
//		for (int i = 0; i < v.length; i++) {
//			if (v[i].equals(x)) {
//				cont++;
//			}
//		}
//		return cont;
//	}

	// Devolver cuantas veces está x en el array de Object v
	public static  int contarVeces (Object[] v, Object x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) {
				cont ++;
			}
		}
		return cont;
	}

	// Devolver cuantas veces está x en un array genérico
	public static <T> int contarVeces2(T[] v, T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].equals(x)) {
				cont++;
			}
		}
		return cont;
	}

	// Devolver el mayor de dos enteros
	public static int mayor(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	// Devolver el mayor de dos double
	public static double mayor(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}

	// Devolver el mayor de dos double
	public static Object mayor(Object a, Object b) {
		if (((Comparable) a).compareTo(b) > 0)
			return a;
		else
			return b;
	}

	// Devolver el mayor de dos double
	public static <T> T mayor2(T a, T b) {
		if (((Comparable) a).compareTo(b) > 0)
			return a;
		else
			return b;
	}
	
	public static <T extends Comparable<T>>  T mayor3(T a, T b) {
		if (a.compareTo(b) > 0)
			return a;
		else
			return b;
	}

}
