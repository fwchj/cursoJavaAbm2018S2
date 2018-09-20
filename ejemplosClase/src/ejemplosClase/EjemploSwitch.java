package ejemplosClase;

public class EjemploSwitch {

	public static void main(String[] args) {
		//Ejemplo usando un switch para imprimir el nombre completo del programa
		String programa = "ME";
		
		switch(programa) {
		// Ejemplo de varias lineas
		case "ME": 	System.out.println("Maestria en economia"); 
					System.out.println("de la division de economia");
					break;
		// Ejemplo de una linea
		case "MAPP": System.out.println("Maestria en administracion y PP"); 
		break;
		// Ejemplo juntar todos en una linea
		case "LE": System.out.println("Licenciatura en economia");break;
		case "LCPRRII": System.out.println("Licenciatura en ciencia politica y relaciones int."); 
		break;
		default: System.out.println("NO conozco el programa");
					
		
		}
		
		

	}

}
