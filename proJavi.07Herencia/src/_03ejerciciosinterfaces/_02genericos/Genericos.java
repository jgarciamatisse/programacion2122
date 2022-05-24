package _03ejerciciosinterfaces._02genericos;


public class Genericos {
	public static void main(String[] args) {
		//Minimo de dos objetos
		System.out.println(minimo("pepe","pepa"));
		//Maximo de un array
		String[] v = {"casa", "coche", "barco"};
		System.out.println(maximo(v));
		
	}
	public static <T extends Comparable <T>> T minimo (T o1, T o2){
		if(o1.compareTo(o2) < 0) return o1;
		else return o2;
	}

	public static <T extends Comparable <T>> T maximo (T[] v){
		T max = v[0];
		for (int i = 1; i < v.length; i++) {
			if(v[i].compareTo(max) > 0) max = v[i];
		}
		return max;
	}
}
