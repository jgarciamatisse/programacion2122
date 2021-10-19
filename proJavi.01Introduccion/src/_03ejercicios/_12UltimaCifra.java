package _03ejercicios;

import java.util.Scanner;

public class _12UltimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Numero: ");
		int numero = tec.nextInt();
		
		System.out.println("Ultima cifra: " + (numero % 10));
	}

}
