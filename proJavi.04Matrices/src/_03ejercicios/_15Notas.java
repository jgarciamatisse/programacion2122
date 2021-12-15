package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		int[][] notas = {
				{9,8,8,8},
				{2,2,2,3},
				{9,7,8,6},
				{9,5,5,5},
				{6,2,8,5}
		};
		//mostrarPorAlumno(notas);
		//mostrarPorAsignatura(notas);
		alguienSuspendeTodo(notas);
	}
	
	public static void mostrarPorAlumno(int[][] n) {
		//Recorremos por fila
		for (int i = 0; i < n.length; i++) {
			System.out.println("Alumno " + (i + 1) + ": ");
			for (int j = 0; j < n[0].length; j++) {
				System.out.println("   Asign. " + (j + 1) + ": " + n[i][j]);
			}
		}
	}
	
	public static void mostrarPorAsignatura(int[][] n) {
		for (int j = 0; j < n[0].length; j++) {
			System.out.println("Asignat.  " + (j + 1) + ": ");
			for (int i = 0; i < n.length; i++) {
				System.out.println("   Alumno. " + (i + 1) + ": " + n[i][j]);
			}
		}
	}
	
	public static void mediasPorAlumno(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			//Calculamos la media del alumno
			double total = 0;
			for (int j = 0; j < n[0].length; j++) {
				total += n[i][j];
			}
			System.out.println("Media alumno " + (i + 1) + ": " + (total / n[0].length) );
		}
		
	}
	
	public static void mediasPorAsignatura(int[][] n) {
		for(int j= 0; j < n[0].length; j++) {
			//Calculamos media de la asignatura
			double total = 0;
			for (int i = 0; i < n.length; i++) {
				total += n[i][j];
			} 
			System.out.println("Media asignatura: " + (j + 1) + ": " + (total / n.length) );
		}
	}
	
	public static void asignaturaMasFacil(int [][] n) {
		double mediaMayor = -1; //Mayor media calculada en cada momento
		int asigMasFacil = 0 ; //Columna en la que esta la mediaMayor
		
		for(int j = 0; j < n[0].length; j++) {
			//Calculamos media de la asignatura
			double total = 0;
			for (int i = 0; i < n.length; i++) {
				total += n[i][j];
			} 
			double media = total / n.length;
			
			//Comprobamos si la media supera a la mejor encontrada
			//hasta el momento
			if(media > mediaMayor) {
				mediaMayor = media;
				asigMasFacil = j;
			}
		}
		
		System.out.println("Asignatura mas facil " + (asigMasFacil + 1));
	}
	
	public static void alguienSuspendeTodo(int[][] n) {
		boolean encAlumnoSuspendeTodo = false;
		for (int i = 0; i < n.length && !encAlumnoSuspendeTodo; i++) {
			//Comprobamos si el alumno i suspende todas las asignaturas
			//Para ello, lo que hacemos es BUSCAR algun aprobado
			boolean encAprobado = false;
			for (int j = 0; j < n[0].length && !encAprobado; j++) {
				if(n[i][j] >= 5) {
					encAprobado = true;
				}
			}
			if(!encAprobado) {
				encAlumnoSuspendeTodo = true; //Este alumno ha suspendido todo
 			}
		}
		if(encAlumnoSuspendeTodo) {
			System.out.println("Hay un alumno que suspende todo");
		} else {
			System.out.println("No hay nadie que suspenda todo");
		}
	}
	
	//Mostrar por pantalla la nota media del alumno a
	public static void mediaAlumno(int[][] n, int a) {
		double total = 0;
		for (int j = 0; j < n[a].length; j++) {
			total += n[a][j];
		}
		System.out.println("Media: " + (total / n[a].length));
	}
	
}
