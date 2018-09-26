package ejemplosClase;

import java.util.Arrays;

public class EjemploArray {

	public static void main(String[] args) {
		double[] grades = {6.8,8.9,10.1};
		System.out.println("grades: "+Arrays.toString(grades));

		// Array de integers
		int[] edad = new int[3];
		edad[0] = 65;
		edad[1] = 38;
		edad[2] = 99;
		System.out.println("edad: "+Arrays.toString(edad));
		
		// Array de chars
		String[] letras = new String[4];
		letras[0] = "a";
		letras[1] = "b";
		letras[2] = "c";
		letras[3] = "d";
		
		System.out.println("letras: "+Arrays.toString(letras));
		
		
		
		// Ilustracion lamina 65: java usa punteros (pointer). Cuidado al copia un arreglo
		int[] x = {1,2,3,4};	// Definimos un arreglo
		int[] y = x; 			// Forma mala de copiar un arreglo: genera un segundo puntero
		int[] z = x.clone();	// Forma correcta de generar una copia
			
		//Vemos que tienen los diferentes arreglos
		System.out.println("x: "+Arrays.toString(x));
		System.out.println("y: "+Arrays.toString(y));
		System.out.println("z: "+Arrays.toString(z));
		System.out.println("--------------------------");
		x[2] = 55; // Cambiamos el tercer elemento de x => dado que y apunta a lo mismo, tambien cambia y
		System.out.println("x: "+Arrays.toString(x));
		System.out.println("y: "+Arrays.toString(y)); // Es el comportamiento no esperado!
		System.out.println("z: "+Arrays.toString(z)); // z no se ve afectada
		
		

		
		
		
	}

}
