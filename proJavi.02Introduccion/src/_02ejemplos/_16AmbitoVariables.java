package _02ejemplos;

//Las variables a, b y resultado son variables locales a cada uno de 
//los métodos (main, calcular1, calcular2)
public class _16AmbitoVariables {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 40; 
		int resultado = calcular1(a, b);
		System.out.println(resultado);
		System.out.println(c);
		
		if(c > 0) {
			int d = 50; //Variable LOCAL a un bloque de código
			System.out.println(d);
		}
		//System.out.println(d); //No se puede acceder a d
	}
	public static int calcular1 (int a, int b) {
		int resultado = calcular2 (2 * a, 2 * b);
		//System.out.println(c); //La variable c es inaccesible desde calcular1
		return resultado;
	}
	public static int calcular2 (int a, int b) {
		int resultado = (a + b) / 3;
		return resultado;
	}
}
