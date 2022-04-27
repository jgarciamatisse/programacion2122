package _02ejemplos._09DosTiposGenericos;

import _02ejemplos._02animales.Gato;
import _02ejemplos._02animales.Perro;

public class TestPareja {
	public static void main(String[] args) {
		Pareja<String, Integer> p1 = new Pareja<>("El Quijote", 450);
		
		Pareja<Perro, Gato> p2 = new Pareja<> (new Perro(), new Gato());
		
	}

}
