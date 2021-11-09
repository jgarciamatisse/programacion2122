package _03ejercicios;

import java.util.Scanner;

public class _16CuentaAtrasFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Solucion 1
		System.out.println("Cuenta atras desde n. Introduce n: ");
		for(int n = tec.nextInt(); n >= 0; n--) {
			System.out.println(n);
		}

		//Solucion 2
		System.out.println("Cuenta atras desde n. Introduce n: ");
		int n = tec.nextInt();
		for(int num = n; num >= 0; num --) {
			System.out.println(num);
		}
		
		//Solucion 3
		for(  ;n >= 0; n--) {
			System.out.println(n);
		}
			
		
	}
}
