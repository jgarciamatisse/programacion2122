package _02ejemplos;

public class _08SalidaFormateada {
	public static void main(String[] args) {
		//Salida no formateada
		System.out.println(Math.PI);
		System.out.println(Math.PI / 100);
		
		//Salida formateada: System.out.format()
		int edad = 42;
		System.out.println("Edad: " + edad);
		System.out.format("Edad %d %n", edad);
		
		int dado1 = (int) (Math.random() * 6 + 1);
		int dado2 = (int) (Math.random() * 6 + 1);
		System.out.format("Ha salido un %d y un %d, que suman %d %n", dado1, dado2, dado1+ dado2);
		
		
		//Formatear numeros enteros: %d (decimal - base 10)
		int numero = 721;
		System.out.format("Precio: %d Euros %n" , numero);
		System.out.format("Precio: %8d Euros %n" , numero);
		System.out.format("Precio: %-8d Euros %n" , numero);
		System.out.format("Precio: %08d Euros %n" , numero);
		
		//Formatear numeros reales: %f (floating point)
		
		double peso = 48.238;
		System.out.format("Peso: %f Kg%n" ,peso);
		System.out.format("Peso: %8.3f Kg%n" ,peso);
		System.out.format("Peso: %8.2f Kg%n" ,peso);
		System.out.format("Peso: %8.4f Kg%n" ,peso);
		
		System.out.format("Peso: %-8.3f Kg%n" ,peso);
		System.out.format("Peso: %-8.2f Kg%n" ,peso);
		System.out.format("Peso: %-8.4f Kg%n" ,peso);
		
		System.out.format("Peso: %08.3f Kg%n" ,peso);
		System.out.format("Peso: %08.2f Kg%n" ,peso);
		System.out.format("Peso: %08.4f Kg%n" ,peso);
		
		
		
		
		
		
	}
}
