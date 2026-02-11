package prueba1;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
		System.out.println(names);
		
		var numbers = new ArrayList<Integer>();
		numbers.add(10);
		System.out.println(numbers);
		
		
		//Tamaño lista (len)
		System.out.println(names.size());
		
		//Añadir elementos
		
		names.add("Hola");
		names.add("Ruben");
		names.add("HEY");
		
		System.out.println(names);
			
		//Acceder a los elementos
		//Para acceder al primer elemento .getFirst y al ultimo .getLast, mientras que los otros .get(con el indice)
		System.out.println(names.getFirst());
		
		//Modificar elementos
		names.set(0, "Bea");
		System.out.println(names.getFirst());
		
		//Eliminar
		names.remove(0);
		System.out.println(names);
		
		//Buscar elementos
		System.out.println(names.contains("Ruben"));
		
		//Limpiar arraylist
		names.clear();
		System.out.println(names);
	}
}
