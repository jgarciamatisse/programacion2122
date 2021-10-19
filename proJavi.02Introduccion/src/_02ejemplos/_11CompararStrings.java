package _02ejemplos;

import java.util.Scanner;

public class _11CompararStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre 1: "); 
		String nombre1 = tec.next();
		System.out.println("Nombre 2: "); 
		String nombre2 = tec.next();
		
		
		if(nombre1 == nombre2) {
			System.out.println("mismo nombre");
		} else {
			System.out.println("distinto nombre");
		}
		
		
		if(nombre1.equals(nombre2)) {
			System.out.println("mismo nombre");
		} else {
			System.out.println("distinto nombre");
		}
		if(nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("mismo nombre");
		} else {
			System.out.println("distinto nombre");
		}
		
		// Y entonces por que ....
		String grupo1 = "primero DAM";
		String grupo2 = "primero DAM";
		if(grupo1 == grupo2) {
			System.out.println("Mismo grupo");
		} else {
			System.out.println("Distinto grupo");
		}
		
		//Mostrar los nombres ordenados
		System.out.println(nombre1.compareTo(nombre2));
		if(nombre1.compareTo(nombre2) < 0) {
			System.out.println(nombre1);
			System.out.println(nombre2);
		} else {
			System.out.println(nombre2);
			System.out.println(nombre1);
		}
		
		
	}

}



