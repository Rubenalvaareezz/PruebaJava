package prueba1;

public class Conditionals {
	public static void main(String[] args) {
		
		//Conditionals
		
		var age = 18;
		
		if (age > 18) {
			System.out.println("El usurario es mayor de edad");
		} else if(age < 18) {
			System.out.println("El usurario es menor de edad");
		} else {
			System.out.println(String.format("El usuario acaba de cumplir %d años",age));
		}
		
		//Switch
		var day = 10;
		
		switch (day) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			default:
				System.out.println("No es ni Lunes, Martes ni Miercoles");
		}
		
		var number = 19;
		if (number % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}
}
	
