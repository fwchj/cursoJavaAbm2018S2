package ejemplosClase;

public class EjemploIfElse2 {

	public static void main(String[] args) {
		// Definimos dos variables tipo boolean (ver abajo para ejemplo con int)
		boolean mujer = true;
		boolean mex  = false;
		
		//Entramos a una lógica de if-elseif-else para tener los 4 casos posibles
		
		if(mujer == true && mex ==true) { // versión larga con ==
			System.out.println("Es mujer de Mexico");
		}
		else if(!mujer && mex) { // versión corta: funciona con boolean (! invierta la evaluación)
			System.out.println("Es hombre de Mexico");
		}
		else if (mujer && !mex) {
			System.out.println("Es mujer de otro país");
		}
		else {  // el else no lleva ningún argumento. 
			System.out.println("Es hombre de otro país");
		}
		
		
		// Version con byte
		
		byte woman = 1;
		byte mexico = 1;
		
		if(woman==1 && mexico==1) { 
			System.out.println("Es mujer de Mexico");
		}
		else if(woman!=1 && mexico==1) { 
			System.out.println("Es hombre de Mexico");
		}
		else if (woman==1 && mexico!=1) {
			System.out.println("Es mujer de otro país");
		}
		else {  // el else no lleva ningún argumento. 
			System.out.println("Es hombre de otro país");
		}

	}

}
