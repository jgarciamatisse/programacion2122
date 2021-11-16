package _03ejercicios;

import java.util.Scanner;

public class _07Notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double nota;
		
		int numNotas = 0, numAprobados = 0;
		double suma = 0;
		
		do {
			System.out.println("Nota: ");
			nota = tec.nextDouble();
			if(nota >= 0) {
				numNotas ++;
				suma += nota;
				if(nota >= 5) {
					numAprobados ++;
				}
			}
		} while (nota >= 0);
		System.out.println("Numero notas: " + numNotas);
		System.out.println("Numero aprobados: " + numAprobados);
		System.out.println("Media: " + suma / numNotas);
		
		// Con while
		numNotas = 0;
		numAprobados = 0;
		suma = 0;
		nota = 0;
		while (nota >= 0) {
			System.out.println("Nota: ");
			nota = tec.nextDouble();
			if(nota >= 0) {
				numNotas ++;
				suma += nota;
				if(nota >= 5) {
					numAprobados ++;
				}
			}
		} 
		System.out.println("Numero notas: " + numNotas);
		System.out.println("Numero aprobados: " + numAprobados);
		System.out.println("Media: " + suma / numNotas);
		
	}
}
