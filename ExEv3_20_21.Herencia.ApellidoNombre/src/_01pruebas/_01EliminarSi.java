package _01pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01EliminarSi {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("casa");
		l1.add("pez");
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		
		l1.removeIf((a)-> {return a.length() == 4;});
		System.out.println(l1);
		
		l2.removeIf((num)-> {return num % 2 == 0;});
	}
}
