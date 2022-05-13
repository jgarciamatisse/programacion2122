package _03ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _09Baloncesto {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("a","b","c","a","a","a","b","b","b","b","a","c","c");
		Map<String, Integer> m = new HashMap<>();
		for(String jugador: l) {
			Integer veces = m.get(jugador);
			if(veces == null) {
				m.put(jugador, 1);
			} else {
				veces++;
				m.put(jugador, veces);
				if(veces == 5) {
					System.out.println(jugador + " expulsado");
				}
			}
		}
	}

}
