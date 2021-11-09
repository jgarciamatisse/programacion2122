package _03ejercicios;

import java.util.Scanner;

public class _19SumaDivisoresNFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Mostrar divisores de n. Introduce n: ");
		int n = tec.nextInt();
		
		int suma = 1 + n;
		for(int numero = 2; numero <= n / 2; numero ++) {
			if(n % numero == 0) {
				suma = suma + numero; //suma += numero;
			}
		}
		System.out.println("Suma: " + suma);

	}
}
