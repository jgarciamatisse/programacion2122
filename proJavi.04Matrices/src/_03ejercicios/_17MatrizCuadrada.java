package _03ejercicios;

public class _17MatrizCuadrada {
	public static void main(String[] args) {
		int[][] m = {
				{11,83,12},
				{21,30,15},
				{98,25,33}
		};
		mostrarDiagonal(m);
	}
	//que muestre por pantalla los elementos de la diagonal principal.
	public static void mostrarDiagonal(int m[][]) {
		//Solucion mala
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(i == j) System.out.println(m[i][j]);
			}
		}
		//Solucion buena
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][i]);
		}
		
	}
	
	public static int filaDelMayor (int m[][]) {
		//que devuelva la fila en que se encuentra el mayor elemento de la matriz
		int mayor = m[0][0];
		int fila = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(m[i][j] > mayor) {
					mayor = m[i][j];
					fila = i;
				}
			}
		}
		return fila;
	}
	public static void intercambiarFilas1(int m[][], int f1, int f2) {
		//Recorremos los elementos de las filas a intercambiar
		for (int j = 0; j < m[0].length; j++) {
			//intercambiamos el elemento j de las dos filas
			int aux = m[f1][j];
			m[f1][j] = m[f2][j];
			m[f2][j] = aux;
			
		}
	}
	public static void intercambiarFilas2(int m[][], int f1, int f2) {
		int[] aux = m[f1];
		m[f1] = m[f2];
		m[f2] = aux;
	}
	
}
