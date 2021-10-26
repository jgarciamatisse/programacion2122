package _02ejemplos;

import java.util.Scanner;

public class _18VariablesGlobalesCorrecto {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
//		Scanner tec = new Scanner(System.in);
		//TODO mejorar este mensaje al usuario 
		System.out.println("Cuantas edades vas a introducir?: ");
		int numEdades = tec.nextInt();
		
		double media = calcularMediaEdades (numEdades);
		System.out.println(media);
	}
	private static double calcularMediaEdades(int numEdades) {
		// TODO Auto-generated method stub
		return 0;
	}

}
