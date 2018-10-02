package ejemplosClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Listas {

	public static void main(String[] args) {
		// ArrayLists
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(9.5);
		grades.add(8.6);
		grades.add(5.6);
		System.out.printf("Size of AL:%s\n",grades.size());
		grades.add(9.5);
		System.out.printf("Size of AL:%s\n",grades.size());
		
		// LOOP DEL ARRAY LIST
		imprimirLista(grades);
		
		// QUITAR UN ELEMENTO (por valor)
		grades.remove(9.5);
		imprimirLista(grades);
		
		// QUITAR UN ELEMENTO (por indice)
		grades.remove(1);
		imprimirLista(grades);
		
		
		// Volvemos a agreagar unos valores
		grades.add(4.9);
		grades.add(10.0);
		imprimirLista(grades);
		
		grades.set(2, 6.0); // cambiamos el valor en el indice 2 a 6.0
		for(double i:grades) {
			System.out.printf("%s, ",i);
		}
		System.out.println("");
		
		
		// Calculamos el maximo y el minimo
		System.out.printf("Max=%s, Min=%s\n", Collections.max(grades),Collections.min(grades));
		
		// Ordenar por valores
		Collections.sort(grades);
		for(double i:grades) {
			System.out.printf("%s, ",i);
		}
		System.out.println("");
		
		
		
		// SETS: no permite duplicados
			HashSet<String> amigos = new HashSet<String>();
			
			amigos.add("John");
			amigos.add("Peter");
			amigos.add("Laura");
			amigos.add("Peter");
			
			for(String i:amigos) {
				System.out.printf("%s, ",i);
			}
			System.out.println("");
			imprimirLista(amigos);
			
			
	} // end main
	
	// Creamos un metodo para imprimir datos de tipo HashSet
	public static void imprimirLista(HashSet<String> lista) {
		for(String i:lista) {
			System.out.printf("%s: ",i);
		}
		System.out.println("");
		
	}

	
	// Creamos un metodo para imprimir datos de tipo ArrayList
	public static void imprimirLista(ArrayList<Double> lista) {
		for(double i:lista) {
			System.out.printf("%s: ",i);
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
