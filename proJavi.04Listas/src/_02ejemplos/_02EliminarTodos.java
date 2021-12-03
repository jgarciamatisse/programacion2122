package _02ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class _02EliminarTodos {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("ana");
		nombres.add("miguel");
		nombres.add("luis");
		nombres.add("ana");
		nombres.add("ana");
		nombres.add("pablo");
		nombres.add("ana");
		nombres.add("miguel");
		nombres.add("ana");
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre a borrar: ");
		String nombreBorrar = tec.next();
		
		//Solucion 1
//		while(nombres.contains(nombreBorrar)) {
//			nombres.remove(nombreBorrar);
//		}
		
		//Solucion 2
//		do {
//			//Nada
//		} while (nombres.remove(nombreBorrar));
		
		//Solucion 3
//		boolean conseguido;
//		do {
//			conseguido = nombres.remove(nombreBorrar);
//		} while (conseguido);
		
		//Solucion 4
		for(int i = 0; i < nombres.size(); i++) {
			if(nombres.get(i).equals(nombreBorrar)) {
				nombres.remove(i);
				i--;
			}
		}
		
		System.out.println(nombres);
	}
}
