package _03ejercicios;

import java.util.Scanner;

public class _03Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe primer numero: ");
		int num1 = tec.nextInt();
		System.out.println("Escribe segundo numero: ");
		int num2 = tec.nextInt();
		System.out.println("Escribe tercer numero: ");
		int num3 = tec.nextInt();

		System.out.println("La media de " + num1 + ", " + num2 
				+ " y " + num3 + " es " + (num1 + num2 + num3) / 3.0);

	}
}
