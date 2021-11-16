package _03ejercicios;

import java.util.Scanner;

public class _06Containers {
	final static int MAXCONTENEDORES = 3;
	final static int MAXPESO = 700;
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int contenedores = 0;
		int pesoTotal = 0;
		int peso;
		do {
			System.out.println("Introduce peso del contenedor: ");
			peso = tec.nextInt();
			
			pesoTotal += peso;
			contenedores ++;
			
		} while(pesoTotal < MAXPESO && contenedores < MAXCONTENEDORES);
		
		if(pesoTotal <= MAXPESO) {
			System.out.println("Contenedores: " + contenedores);
			System.out.println("Peso total: " + pesoTotal);
		} else {
			System.out.println("Contenedores: " + (contenedores - 1));
			System.out.println("Peso total: " + (pesoTotal - peso));
			
		}
	}

}
