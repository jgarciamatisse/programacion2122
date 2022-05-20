package _03ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _10Matriculas {
	/* Escribir un programa en el que,
	 	dado un Map<String, Integer> que contiene parejas formadas
	 	por una matricula y el año en que se matriculo el vehiculo
	 	
	 	"2344BBD", 2003
	 	"2344BBB", 2001
	 	"2345BBB", 2001
	 	"2344BBC", 2002
	 	
	 	Muestre por pantalla cuantos vehículos hay de cada año
	 	2001 --> 2 vehiculos
	 	2002 --> 1 vehiculos
	 	2003 --> 1 vehiculos
	 	
	 	Se mostrará ordenado por año	 
	*/
	public static void main(String[] args) {
		Map<String, Integer> vehiculos = new HashMap<>();
		vehiculos.put("2344BBD", 2003);
		vehiculos.put("2344BBB", 2001);
		vehiculos.put("2345BBB", 2001);
		vehiculos.put("2344BBC", 2002);
		
		Map<Integer, Integer> m = new TreeMap<>();
		
		//Recorremos los vehiculos
		for(String matricula: vehiculos.keySet()) {
			//De cada vehiculo obtenemos el anyo de matriculacion
			Integer anyo = vehiculos.get(matricula);
			
			//En el map m añadimos 1 al año correspondiente
			Integer numero = m.get(anyo);
			if(numero == null) {
				m.put(anyo,1);
			} else {
				m.put(anyo, numero + 1);
			}
		}
		
		//Recorremos el map m para mostrar los resultados
		for(Integer anyo: m.keySet()) {
			Integer numero = m.get(anyo);
			System.out.println(anyo + " ----> " + numero + " vehiculos" );
		}
		
	}
	

}
