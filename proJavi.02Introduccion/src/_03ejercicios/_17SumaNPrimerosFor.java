package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimerosFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Suma de 1 a n. Introduce n: ");
		int n = tec.nextInt();

		int suma = 0;
		for(int num = 1; num <= n; num++) {
			suma = suma + num;
		}
		System.out.println("Suma: " + suma);
	}
}
