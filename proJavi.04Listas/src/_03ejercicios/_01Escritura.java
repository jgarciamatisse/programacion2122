package _03ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class _01Escritura {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		ArrayList<Character> l = new ArrayList<>();
		int posicion = 0;
		
		//Recorremos el String y procesamos los caracteres
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			switch(c) {
			case '+':
				if(posicion < l.size()) {
					posicion ++;
				}
				break;
			case '-':
				if(posicion > 0) {
					posicion --;
				}
				break;
			case '*':
				if(posicion < l.size()) {
					l.remove(posicion);
				}
				break;
			default: 
				l.add(posicion,c);
				posicion = posicion + 1;
			}
		}
		System.out.println(l);
	}
}
