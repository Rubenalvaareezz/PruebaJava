package prueba1;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, Integer> names = new HashMap<>();
		
		//Tamaño
		System.out.println(names.size());
		
		//Añadir elementos
		names.put("Ruben", 18);
		names.put("Bea", 18);
		names.put("Jmeme", 19);
		System.out.println(names);
		
		//Acceder elementos
		System.out.println(names.get("Ruben"));
		
		//Verificar elementos
		System.out.println(names.containsKey("Ruben"));
		
		//Eliminar elementos
		System.out.println(names.remove("Jmeme"));
		System.out.println(names);
		
		//Limpiar
		//names.clear();
		System.out.println(names);	
		
		//Modificacion de elementos
		names.replace("Ruben",19);
		System.out.println(names);
		
		//Añadir si no existia
		names.putIfAbsent("Uarag", 100);
		System.out.println(names);
		
		//Otras operaciones
		System.out.println(names.isEmpty());
		System.out.println(names.keySet());
		System.out.println(names.values());

	}

}
