package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Mb consumidos: ");
		double mb = tec.nextDouble();
		System.out.println("Minutos hablados: ");
		int min = tec.nextInt();
		
		//5 € de contrato
		double coste = 5; 
		
		//Consumo datos
		double costeDatos;
		if(mb < 1000) costeDatos = mb * 0.05;
		else if(mb < 1500) costeDatos = mb * 0.03;
		else if(mb < 5000) costeDatos = mb * 0.02;
		else costeDatos = mb * 0.01;
		
		//Llamadas
		double costeLlamadas;
		if(mb >= 5000) costeLlamadas = 0;
		else {
			if(min <= 200) { 
				costeLlamadas = 5;
			} else {
				costeLlamadas = 5 + (min - 200) * 0.07;
			}
		}
		
		System.out.println("Coste por datos: " + costeDatos + " € (sin iva)");
		System.out.println("Coste por llamadas: " + costeLlamadas + " € (sin iva)");
		coste = coste + costeDatos + costeLlamadas;
		System.out.println("Total: " + coste + " € (sin iva)");
		System.out.println("Total IVA INCLUIDO: " + calcularIVA(coste, 21));
	}
	public static double calcularIVA (double num, double porcentaje) {
		return num + (num * porcentaje / 100);
	}
}





