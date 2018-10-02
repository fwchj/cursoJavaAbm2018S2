package ejemplosClase;

import java.util.HashMap;
import java.util.Map.Entry;

public class EjemploHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> dias = new HashMap<Integer,String>();
		dias.put(1, "Lunes");
		dias.put(2, "Martes");
		dias.put(5, "Viernes");
		dias.put(3, "Miercoles");
		dias.put(4, "Jueves");
		dias.put(6, "Sabado");
		dias.put(7, "Domingo");
		dias.put(8,"Quien sabe");
		
		dias.remove(8); // quitar lo que no queremos
		
		
		// Loop sobre valores
		for(String d:dias.values()) {
			System.out.printf("%s\n", d);
		}
		System.out.println("");
		
		
		// Loop sobre valores
		for(Integer d:dias.keySet()) {
			System.out.printf("%s, ", d);
		}
		System.out.println("");
		
		
		// Loop sobre la combinacion de key,value
		for(Entry d:dias.entrySet()) {
			System.out.printf("%s => %s\n", d.getKey(),d.getValue());
		}
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		

	}

}
