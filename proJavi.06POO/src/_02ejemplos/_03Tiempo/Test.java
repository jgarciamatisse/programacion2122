package _02ejemplos._03Tiempo;

import java.util.Scanner;

/**
 * La versión 1 tiene un problema: no tenemos control
 * sobre que valores toman los atributos
 *
 * Modificar el programa para que si el instante de tiempo introducido es incorrecto,
 * lo vuelva a pedir
 */
public class Test {
	static Scanner tec = new Scanner(System.in);
	//Pedir al usuario hora de entrada y hora de salida, que tienen
	//que ser distintas
	public static void main(String[] args) {
		Tiempo entrada, salida;
		do {
			System.out.println("Hora de entrada: ");
			entrada = leerTiempo();
			
			System.out.println("Hora de salida: ");
			salida = leerTiempo();
			
			if(entrada.equals(salida)) {
				System.out.println("Las horas tienen que ser distintas");
			}
			
		} while (entrada.equals(salida));
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + salida);
		
		
	}
	public static Tiempo leerTiempo() {
		System.out.println("Hora: "); 
		int h = tec.nextInt();
		System.out.println("Minuto: ");
		int m = tec.nextInt();
		System.out.println("Segundo: ");
		int s = tec.nextInt();
		Tiempo t = new Tiempo(h,m,s);
		return t;
	}
}
