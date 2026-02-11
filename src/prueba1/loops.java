package prueba1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class loops {

	public static void main(String[] args) {
		
		//for
		for (int i = 0; i <=5; i++) {
			System.out.println("Hola, Java");
		 }
		
		String[] names = {"Ruben","Jose","Alberto"};
		for (int i1 = 0; i1<2; i1++) {;
			System.out.println(names[i1]);
		 }
		
		//for-each
		for	(String name: names) {
		System.out.println(name);
		}
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for (Integer number: numbers) {
			System.out.println(number);
		}
		
		HashMap<String, Integer> dnis = new HashMap<>();
		dnis.put("Ruben", 3727373);
		dnis.put("Bea", 37892131);
		dnis.put("Jmeme", 29193812);
		for (Map.Entry<String, Integer> dni:dnis.entrySet()) {
			System.out.println(dni.getValue());
			
		}
		
	}
}
