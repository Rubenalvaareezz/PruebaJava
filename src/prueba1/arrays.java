package prueba1;

public class arrays {
	
	public static void main(String[] args) {
		
		//Declaracion y creación
		int[] number = new int[3];
		System.out.println(number);
		
		String[] name = {"Alvarez","Ruben","Rubio"};
		System.out.println(name);
		
		//Acceso
		System.out.println(number[0]);
		System.out.println(name[0]);
		
		//Modificación
		number[0] = 1;
		number[1] = 10;
		System.out.println(number[1]);
	}
}
