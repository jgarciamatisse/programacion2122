package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresNFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Mostrar divisores de n. Introduce n: ");
		int n = tec.nextInt();
	
		System.out.println(1);

		for (int numero = 2; numero <= n / 2; numero++) {
			if(n % numero == 0) {
				System.out.println(numero);
			}
		}

		System.out.println(n);

	}
}
