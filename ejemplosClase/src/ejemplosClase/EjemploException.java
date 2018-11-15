package ejemplosClase;

import java.util.ArrayList;

public class EjemploException {

	public static void main(String[] args) {
		// EJEMPLO 1
		int a = 5;
		int b = 0; 
				
		try{
			System.out.printf("a/b = %s\n",a/b);
		}
		catch(ArithmeticException error1) {
			System.out.println("Intentaste dividir por 0! Reprobado");
		}
		
		
		// EJEMPLO 2
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(4);
		try {
			for(int i=0;i<=lista.size();i++) {
			System.out.printf("%s\t",lista.get(i));
			}
		}
		catch(NullPointerException e) {
			System.out.println("El arraylist no está definido");
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println("Solicitaste un elemento que no existe");

		}
		
		
		
		
		
		
		

	}

}
