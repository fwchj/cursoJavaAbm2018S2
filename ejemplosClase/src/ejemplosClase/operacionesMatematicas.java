package ejemplosClase;

public class operacionesMatematicas {

	public static void main(String[] args) {

		// Declaramos e initializamos algunas variables numericas
		int a = 5;
		int b = 70;
		int c = 13;
		int d=14,e=15; // version rapida si tenemos que declarar varias variables del MISMO tipo
		
		//Suma de dos valores
		System.out.printf("a+b= %s\n",a+b);
		
		// Division de dos valores: importante hacer el 'cast' 
		System.out.printf("c/b = %5.3f\n",(double)c/b);
		
		//lo mismo pero guardando la informacion
			double division = (double)c/a;
			System.out.printf("c/a = %s\n",division);
		
		// Calcular el modulo
		System.out.printf("d %% a = %s\n",d%a);
		
		// Rondear variables
		double div = (double)c/b;
		System.out.printf("Floor: %s\n", Math.floor(div));
		System.out.printf("Ceil: %s\n", Math.ceil(div));
		System.out.printf("Round: %s\n", Math.round(div));
		
		
		// Calcular el maximo de a,b y c
		System.out.printf("Maximo: %s\n",Math.max(a, Math.max(b, c)));
		
		
	}

}
