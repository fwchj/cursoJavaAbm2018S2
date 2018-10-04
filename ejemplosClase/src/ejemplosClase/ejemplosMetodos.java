package ejemplosClase;

public class ejemplosMetodos {

	public static void main(String[] args) {

		// Calculamos la suma, guardamos el resultado en una variable  y luego la imprimimos
		double suma = calcularSuma(9.5,8.6,1.3);
		System.out.printf("la suma es: %4.3f\n",suma);
		
		// Calculamos e imprimimos el valor directamente	
		System.out.printf("la suma es: %10.3f\n",calcularSuma(1.2,3.4,5.6));
		
		// Aqui usamos los metodos void que no regresan un valor
		computeSum(1.2,3.4,5.6);
		computeSum(1.2,3.4);
		
		// Vasmos a usar el mismo metodo, pero con otros argumentos
		// Automaticamente Java sabe cual usar
		String a = "2";
		String b = "3";
		computeSum(a,b);
		

	}

	// Metodo para mostrar la operacion (suma) de dos strings
	private static void computeSum(String x1, String x2) {
		System.out.printf("The sum is equal to: %s+%s\n",x1,x2);
		
	}

	// Metodo para calcular la suma de 2 doubles
	private static void computeSum(double x1, double x2) {
		System.out.printf("The sum is equal to: %6.4f\n",x1+x2);
		
	}

	// Metodo para calcular la suma de 3 doubles
	private static double calcularSuma(double x1, double x2, double x3) {
		return x1+x2+x3; // Calcular la suma y regresarla
	}
	
	
	// Metodo void para calcular la suma de 3 valores doubles
	private static void computeSum(double x1, double x2, double x3) {
		System.out.printf("The sum is equal to: %6.4f\n",x1+x2+x3);
	}

	
}



