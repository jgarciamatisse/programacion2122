package _01pruebas;

import java.util.Scanner;

public class LeerVariosDatos {
	public static void main(String[] args ) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce dia mes año: ");
		int dia = tec.nextInt();
		int mes = tec.nextInt();
		int anyo = tec.nextInt();
		System.out.println(dia + "-" + mes + "-" +anyo);
		
	}
}
