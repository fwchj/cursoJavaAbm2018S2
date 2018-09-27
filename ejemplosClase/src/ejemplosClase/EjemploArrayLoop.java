package ejemplosClase;

public class EjemploArrayLoop {

	public static void main(String[] args) {

		double[] grades = {9.5, 8.6, 7.9, 10.0};
		
		// Primera manera de hacer un loop
		for(int indice=0 ; indice<grades.length; indice++) {
			System.out.printf("Indice %s => %s\n",indice,grades[indice]);
		}
		
		// Version rapida
		for(double valor:grades) {
			System.out.printf("Valor=%s\n",valor);
		}
		
		// Ejercicio 1: sumar todos los valores en el arreglo grades
		double sum = 0.0;
		for(double grade:grades) {
			sum +=grade;
		}
		
		System.out.printf("La suma es igual a %s\n",sum);
			double suma=0.0;
			//Version mas complicada
			for(int i=0;i<grades.length;i++) {
				suma +=grades[i];
			}
			System.out.printf("La suma es igual a %s\n",suma);
			
		System.out.println("==============================");		

		// Ejercicio 2: Hacer el primer for al reves: empezar con indice 3 y terminar con el cero
		for(int i=grades.length-1;i>=0;i--) {
			System.out.printf("Indice %s => %s\n",i,grades[i]);

		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
