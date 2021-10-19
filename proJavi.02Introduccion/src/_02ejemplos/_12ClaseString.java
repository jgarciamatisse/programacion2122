package _02ejemplos;

import java.util.Scanner;

public class _12ClaseString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Equals: para comprobar si un string es igual que otro
		//Ejemplo:
		System.out.println("Nombre: ");
		String nombre = tec.next();
		if(nombre.equals("pepe")) {
			System.out.println("Te llamas pepe");
		} else {
			System.out.println("No te llamas pepe");
		}
		
		
		//toUpperCase() y toLowerCase(): Devuelven el String en Mayusc./ Minusc.
		System.out.println("Nombre en minusc. " + nombre.toLowerCase());
		System.out.println("Nombre en mayusc. " + nombre.toUpperCase());
		
		//charAt(): 
		// 		Permite consultar qué caracter hay en determinada posición
		//		La primera posición es la 0
		//		Se produce un error si la posición es incorrecta
		//Ejemplo:
		System.out.println("La inicial de tu nombre es " + nombre.charAt(0));
		//Ejemplo: guardar en variable
		char segundaLetra = nombre.charAt(1);
		//Ejemplo: leer caracter
		System.out.println("Cual es la inicial de tu nombre?: ");
		char inicial = tec.next().charAt(0);
		
		//indexOf(caracter): Devuelve la posicion de la primera aparicion del caracter en el String
		//		Devuelve -1 si el caracter no está
		System.out.println("casablanca".indexOf('a'));
		//indexOf(string): Devuelve la posicion de la primera aparicion del string en el string
		System.out.println("casablanca".indexOf("blanca"));
		
		//indexOf(caracter,fromIndex): Devuelve la primera posicion A PARTIR
		//	de la posicion indicada
		System.out.println("casablanca".indexOf('a',4)); //->>
		
		//En que posicion está la segunda 'a' de nombre
		System.out.println(nombre.indexOf('a',nombre.indexOf('a') + 1));
		
		//substring(desde, hasta)
		//substring(desde)
		System.out.println("casablanca".substring(0,4)); //--> "casa"
		System.out.println("casablanca".substring(4)); //--> "blanca"
		System.out.println("casablanca".substring(4,100)); //--> ERROR
		
		//length: Numero de caracteres que tiene la cadena
		//trim(): Devuelve la cadena sin espacios delante o detrás
		
		
		
	}

}
