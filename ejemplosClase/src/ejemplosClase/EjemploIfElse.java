package ejemplosClase;

public class EjemploIfElse {

	public static void main(String[] args) {
		// Ejemplo binario hombre/mujer
		int mujer = 3;
		if(mujer==1) {
			System.out.println("Es mujer");
		}
		else {
			System.out.println("Es hombre");
		}
		
		
		// Lo mismo con un boolean
		boolean woman = false;
		if(woman) {
			System.out.println("Es mujer");
		}
		else {
			System.out.println("Es hombre");
		}
		
		
		// Ejemplo de intervalos => ingreso
		double ingreso = 100000.0;
		
		if(ingreso<5000) {
			System.out.println("Clase baja");
		}
		else if(ingreso < 20000){
			System.out.println("Clase media");
		}
		else {
			System.out.println("Clase alta");
		}
		
		
		// 
	
		
		
		
		
		
	}

}
