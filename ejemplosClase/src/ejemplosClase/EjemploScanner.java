package ejemplosClase;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("Cu�l es tu edad?");
		byte edad = miScanner.nextByte();
		System.out.printf("Gracias, tu edad es %s\n",edad);
		
		System.out.println("C�mo te llamas?");
		String nombre = miScanner.next();
		System.out.printf("Hola %s\n",nombre);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
