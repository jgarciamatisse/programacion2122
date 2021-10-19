package _03ejercicios;

import java.util.Scanner;

public class _14ImparesHastaN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Impares hasta n. Introduce n: ");
		int n = tec.nextInt();
		
		int impar = 1;
		while(impar <= n) {
			System.out.println(impar);
			impar = impar + 2;
		}
		
	}
}
