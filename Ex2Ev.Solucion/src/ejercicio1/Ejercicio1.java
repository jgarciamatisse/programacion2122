package ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[][] hacheMayuscula = {
				{0,0,0,0,0,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,1,1,1,1,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,0,0,0,0,0}
		};
				
		int[][] oMinuscula = {
				{0,0,0,0,0,0},
				{0,0,1,1,0,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,0,1,1,0,0},
				{0,0,0,0,0,0},
		};
		
		imprimirLetra(hacheMayuscula);
		imprimirLetra(oMinuscula);
		
		//Completar para mostrar las letras con borde usando los metodos
		//anyadirBorde(...) e imprimirLetra(...)
		imprimirLetra(anyadirBorde(hacheMayuscula));
		System.out.println();
		imprimirLetra(anyadirBorde(oMinuscula));

	}
	public static void imprimirLetra(int [][] letra) {
		for (int i = 0; i < letra.length; i++) {
			for (int j = 0; j < letra[i].length; j++) {
				if(letra[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print('X');
				}
			}
			System.out.println();
		
		}
	}
	
	public static int[][] anyadirBorde(int[][] letra) {
		//Creamos una matriz con dos filas y dos columnas mas
		int[][] letraBorde = new int[letra.length + 2][letra[0].length + 2];
		//Rellenamos la matriz
		for (int i = 0; i < letraBorde.length; i++) {
			for (int j = 0; j < letraBorde[0].length; j++) {
				//La primera y ultima fila y columna con unos
				if(i == 0 || j == 0 || i == letraBorde.length - 1 || j == letraBorde[0].length - 1) {
					letraBorde[i][j] = 1;
				} else {
					//El resto de elementos los tomamos de letra, desplazados una posicion
					letraBorde[i][j] = letra[i-1][j-1];
				}
			}
		}
		return letraBorde;
	}
}
