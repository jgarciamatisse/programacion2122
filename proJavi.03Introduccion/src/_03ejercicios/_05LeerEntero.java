package _03ejercicios;

import java.util.Scanner;

public class _05LeerEntero {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("Edad: ");
//		int edad = leerEnteroPositivo();
//		if(edad >= 18) {
//			System.out.println("Mayor de edad");
//		} else {
//			System.out.println("Menor de edad");	
//		}
		
		// Leer nota
		int nota = leerEntero ("Introduce nota (0 a 10): ", 0, 10);
		if(nota >= 5) System.out.println("Aprobado");
		else System.out.println("Suspendido");
	}
	public static int leerEnteroPositivo () {
		int num;
		do {
			System.out.println("Introduce entero positivo: ");
			num = tec.nextInt();
			if(num < 0) {
				System.out.println("Número incorrecto");
			}
		} while(num < 0);
		return num;
	}
	
	/**
	 * Lee de teclado un entero mostrando previamente un mensaje. Si el entero
	 * introducido no está en determinado rango, lo vuelve a leer
	 * @param mensaje texto que se mostrará antes de leer el entero
	 * @param minimo valor más pequeño que se admite
	 * @param minimo valor más grande que se admite
	 * @return el entero introducido por el usuario
	 */
	public static int leerEntero(String mensaje, int minimo, int maximo) {
		int num;
		do {
			System.out.println(mensaje);
			num = tec.nextInt();
			if(num < minimo || num > maximo) {
				System.out.print("ERROR. ");
			}
		} while (num < minimo || num > maximo);
		
		return num;
	}
	
	public static int leerEntero2(String mensaje, int minimo, int maximo) {
		int num;
		boolean incorrecto;
		do {
			System.out.println(mensaje);
			num = tec.nextInt();
			incorrecto = num < minimo || num > maximo;
			if(incorrecto) {
				System.out.print("ERROR. ");
			}
		} while (incorrecto);
		
		return num;
	}
}
