package prueba1;

public class JavaExercises {
	
	public static void main(String[] args) {
		
		//Variables
		
		String name = "Ruben";
		System.out.println(name);
		
		name = "Jorge";
		System.out.println(name);
		
		//No podemos el tipo de valor de una variable, si se inicializa string siempre sera un string
		
		int age = 12;
		System.out.println(age);
		
		//El var detecta el tipo sin tener que definirla viendo que tipo hay detras del =
		
		var email = "Rubenalvarez@gmail.com";
		System.out.println(email);
		
		var year = 2026;
		System.out.println(year);
		
		/*Constante (No poder cambiar un valor de una variable)
		(Escribir constantes en mayusculas para detectarlas mas fácilmente)*/
		
		final String EMAIL = "Rubenalvarez@gmail.com";
		System.out.println(EMAIL);
		
		
		
	}

}
