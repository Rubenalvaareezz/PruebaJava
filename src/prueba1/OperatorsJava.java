package prueba1;

public class OperatorsJava {
	public static void main(String[] args) {
		var name = "Ruben";
		
		//Longuitud
		
		System.out.println(name.length());
		
		//Obtener Caracter	
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(name.length()-1));
		
		//Obtener una subcadena
		System.out.println(name.substring(2));
		System.out.println(name.substring(1, 3));
		System.out.println(name.subSequence(0, 0));
		
		//Mayúsculas/Minusculas 
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//Contiene
		System.out.println("Hola, Java".contains("AVA"));
		System.out.println("Hola, Java".toUpperCase().contains("AVA"));
		
		//Comparación (No es lo mismo comparar en mayuscula y en minuscula)
		System.out.println(name.equals("Ruben"));
		
		//Comparacion ignorando mayuscula y minuscula
		System.out.println(name.equalsIgnoreCase("ruben"));
		
		//Trim == Strip
		
		System.out.println(" Hola, me llamo Rubén ".trim());
		
		//Replace
		System.out.println(" Hola, me llamo Rubén ".replace(" ", ""));
		
		//Format
		
		//%s cadenas de texto, %d numeros enteros, %f numeros decimales
		var age = 18;
		System.out.println(String.format("Mi nombres es %s y tengo %d años", name,age));
	}
}
