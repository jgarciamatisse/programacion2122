package _03ejercicios;

import java.util.Scanner;

public class _14ImparesHastaNFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Impares hasta n. Introduce n: ");
		int n = tec.nextInt();
		
		for(int impar = 1; impar <= n; impar += 2) {
			System.out.println(impar);
		}
		
		
		
	}
}
