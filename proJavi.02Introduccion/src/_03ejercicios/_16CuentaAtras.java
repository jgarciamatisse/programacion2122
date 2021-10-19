package _03ejercicios;

import java.util.Scanner;

public class _16CuentaAtras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuenta atras desde n. Introduce n: ");
		int n = tec.nextInt();
		
		while(n >= 0) {
			System.out.println(n);
			n = n - 1;
		
		}
		
	}
}
