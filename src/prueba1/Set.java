package prueba1;

import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		var numbers = new HashSet<Integer>();
		
		//Tamaño
		System.out.println(names.size());
		
		//Añadir elementos
		
		names.add("si");
		names.add("Hola");
		names.add("Ruben");
		names.add("HEY");
		
		System.out.println(names);
		
		//Acceder a los elementos
		//No se puede acceder a los elementos en un set porque no existe un orden por tanto no podemos acceder de manera ordenada a un elemento
		
		//Modificar los elementos
		//No se pueden modifica tampoco los datos por la misma razon, no se donde esta al no estar ordenados
		
		//Buscar elementos (si se puede// para buscar elementos mejor set, para trabajar de manera ordenada arraylist)
		System.out.println(names.contains("si"));
		
		//Eliminar elementos (No se puede por el índice pero si poniendo el dato)
		names.remove("si");
		System.out.println(names.contains("si"));
		
		//Conjuntos
		HashSet<String> countries = new HashSet<>();
		countries.add("España");
		countries.add("Marruecos");
		countries.add("Dubai");
		
		names.addAll(countries);		
		System.out.println(names);
		
		//Se lo quitamos
		names.removeAll(countries);
		System.out.println(names);
		
		//rtiene los que no son comunes, es decir los de countries se mantienen en la lista
		names.retainAll(countries);
		System.out.println(names);
	}
}
