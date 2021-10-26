package _03ejercicios;

public class _01Edades {
	public static void main(String[] args) {
		int m = 17, j = 18, p = 18, v = 18;

		// a: Miguel menor de edad
		boolean a = m < 18;
		System.out.println("Miguel menor de edad: " + a);

		// b: Miguel menor que Julio
		boolean b = m < j;
		System.out.println("Miguel menor que Julio: " + b);

		// c: Miguel es el más viejo.
		boolean c = m > j && m > p && m > v;
		System.out.println("Miguel es el más viejo: " + c);

		// d: Miguel no es el más joven.
		boolean d = m >= j || m >= p || m >= v;
		d = !(m < j && m < p && m < v);
		System.out.println("Miguel no es el más joven: " + d);

		// e: Miguel y Julio son menores de edad
		boolean e = m < 18 && j < 18;
		System.out.println("Miguel y Julio son menores de edad: " + e);
		
		//f: Alguno de ellos es mayor de edad
		boolean f = m >= 18 || p >= 18 || j >= 18 || v >= 18;
		System.out.println("Alguno es mayor: " + f);
		
		// g: miguel y julio son los más jovenes
		boolean g = m < p && m < v && j < p && j < v;
		System.out.println("Miguel y Julio son los más jovenes: " + g);
		
		// h: Entre todos tienen más de 100 años
		boolean h = (m + j + p + v) > 100;
		System.out.println("Suman mas de 100: " + h);
		
		// i: Entre Miguel y Julio suman más que Pablo
		boolean i = m + j > p;
		System.out.println("Miguel y Julio suman más que Pablo: " + i);

		// j: entre miguel y juliuo más edad que pablo y vicente
		boolean apartadoJ = m + j > p + v;
		System.out.println("j: " + apartadoJ);
		
		// k: 
		
		// l:
		
		// m:
		
		// n:

		// o: al menos dos de ellos tienen la misma edad
		boolean o = m == j || m == p || m == v || j == p || j == v || p == v;
		System.out.println("Al menos dos tienen la misma edad " + o);
	}

}
