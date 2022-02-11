package _03ejercicios;

public class _18Simetria {
	public static void main(String[] args) {
		int [][] m = {
				{1,2,3,4},
				{2,1,8,9},
				{3,8,5,6},
				{4,9,6,1}
		};
		System.out.println(esSimetrica(m));
	}
	
	public static boolean esSimetrica(int[][] m) {
		boolean enc = false; //Vamos a buscar una ASIMETRIA
		for (int i = 1; i < m.length && !enc; i++) {
			for (int j = 0; j < i && !enc; j++) {
				if(m[i][j] != m[j][i]) {
					enc = true;
				}
				
			}
		}
//		if(enc) return false;
//		else return true;
		return !enc;
	}
	public static boolean esSimetrica2(int[][] m) {
		boolean simetrica = true; //Vamos a buscar una ASIMETRIA
		for (int i = 1; i < m.length && simetrica; i++) {
			for (int j = 0; j < i && simetrica; j++) {
				if(m[i][j] != m[j][i]) {
					simetrica = false;
				}
				
			}
		}
		return simetrica;
	}
}
