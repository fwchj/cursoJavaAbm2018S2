package ejemplosClase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Formatter;

public class WriteFile {
	public static void main(String[] args) {
		try {
			// FAMILY DATA EXPORT
				String path="C:/java/myfile.txt";	// Define the location of the file
				//path ="myfile.txt";	// Here I set it to the working directory for simplicity
				
				FileOutputStream outStream;  // Similar to the Scanner, but for output
				
				outStream = new FileOutputStream(path,false); //the second argument is to overwrite (true would append)
				
				
				Formatter outputFile = new Formatter(outStream);  //Formatter is similar to printf
				
				outputFile.format("Hello world!\n"); // Write simple text
				outputFile.format("%s + %9.3f = %6.2f",300,66.6667,300+66.6667); 
				// Formats work exactly the same way as in printf(args...)
				
				outputFile.close();  //Close the file once we finished
		}
		catch (FileNotFoundException e) {
			System.exit(1);
		}
				
	}
}
