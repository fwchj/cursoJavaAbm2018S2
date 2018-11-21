package ejemplosClase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Formatter;

public class EjemploEscribirArchivo {

	public static void main(String[] args) {
		
		try {
			//Abrimos un archivo y definimos el formatter
			FileOutputStream outputStream = new FileOutputStream("miArchivo.txt",false);
			Formatter output = new Formatter(outputStream);
			
			// Escribimos en el archivo
			output.format("Este es mi archivo\n");
			for(int i=0;i<14;i++) {
				output.format("%s\t",i);
			}
			output.format("\n");
			
			for(int i=0;i<14;i++) {
				output.format("%3.2f\t",(double)	i);
			}
			
			// Cerramos el archivo para asegurarnos que nada mas se escribe alla
			output.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
