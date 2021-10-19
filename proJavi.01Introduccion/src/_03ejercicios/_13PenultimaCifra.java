package _03ejercicios;

import java.util.Scanner;

public class _13PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Numero: ");
		int numero = tec.nextInt();
		
		System.out.println("Penultima cifra: " + (numero / 10 % 10));
	}

}
