package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	
	final static int N = 3; //M�ximo numero de contrasenyas que se conservan
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		//Primera contrasenya: "aaa"
		ArrayList<String> contrasenyas = new ArrayList<>();
		contrasenyas.add("aaa");
		
		//Bucle infinito
		while(true) {
			System.out.print("Indica contrasenya actual y dos veces la nueva: ");
			String antigua = tec.next();
			String nueva1 = tec.next();
			String nueva2 = tec.next();
			
			if (!antigua.equals(contrasenyas.get(contrasenyas.size() - 1))) {
				System.out.println("La contraseña indicada es incorrecta");
			} else {
				if (!nueva1.equals(nueva2)) {
					System.out.println("Las dos versiones de la nueva contraseña tienen que coincidir");
				} else {
					if (contrasenyas.contains(nueva1)) {
						System.out.println("La contraseña ha sido usada recientemente");
					} else {
						contrasenyas.add(nueva1);
						if (contrasenyas.size() > N) {
							contrasenyas.remove(0);
						}
						System.out.println("Contraseña cambiada correctamente");
					}
				}
			}
			
		}
	}
}
