package _03ejercicios;

import java.util.Scanner;

public class _11Fuerza {
	public static void main(String[] args) {
		final double G = 6.693E-11;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Masa 1: ");
		double m1 = tec.nextDouble();
		System.out.println("Masa 2: ");
		double m2 = tec.nextDouble();
		System.out.println("Distancia: ");
		double d = tec.nextDouble();
		
		double f = (m1 * m2 * G) / (d * d);
		System.out.println(f);
		
		
	}

}
