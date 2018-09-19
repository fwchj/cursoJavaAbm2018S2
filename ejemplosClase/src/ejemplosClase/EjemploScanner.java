package ejemplosClase;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		// Declaramos e initializamos el scanner (requiere la importacion del paquete) 
		Scanner miScanner = new Scanner(System.in);
		
		
		System.out.println("Cuál es tu edad?");		// Aqui damos la instruccion al usuario
		byte edad = miScanner.nextByte();			// Leemos el siguiente valor de tipo byte
		System.out.printf("Gracias, tu edad es %s\n",edad);		// Imprimimos la informacion en la consola
		
		System.out.println("Cómo te llamas?");		// Nueva instruccion al usuario
		String nombre = miScanner.next();			// Leemos la proxima palabra: nada mas toma una palabra
		System.out.printf("Hola %s\n",nombre);		// Imprimimos la informacion
		
		
		System.out.println("Y tu nombre completo?");	// Instruccion para dar el nombre completo 
		nombre = miScanner.nextLine();				// Hack: nextLine() toma automaticamente lo que queda de la linea, pero en la consola eso siempre es 'nada' (esta linea nada mas hace que se espere)
		nombre = miScanner.nextLine();		// Aqui leemos realmente el input del usuario: intenta con nombre y apellido
		System.out.printf("Hola %s\n",nombre); // Imprimimos el nombre completo
		
		
		miScanner.close(); // Aqui cerramos el scanner para que no se quede abierto y a lo mejor se confunde con otro. 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
