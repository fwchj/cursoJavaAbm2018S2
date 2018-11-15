package ejemplosClase; 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		// Start defining the necessary objects for the input
		String path = "workers.txt"; 	// Define the location of the file
		Scanner scanner = null;			// Declare the scanner
		
		try { // We need the try-catch in case of not finding the file
			// Here we define the scanner, instead of System.in (console)
			// we now use the FileReader
			scanner = new Scanner(new BufferedReader(new FileReader(path)));
		} catch (FileNotFoundException e) {
			System.out.println("I could not find the file"); //error msg sent if file not found
			e.printStackTrace(); 
			
		}
		scanner.useDelimiter(",");  // Define the symbol , as the separator between two elements
		scanner.nextLine();			// Jump to the next line (in case the first line has only titles
		
		while(scanner.hasNext()){ // Check if there is a next element (continue until the end of file (EOF))
			String name 		= scanner.next().trim(); // load first element as String and save as name
			String familyName 	= scanner.next().trim(); // load second element as String 
			int age 			= scanner.nextInt();	 // load the age to a integer
			boolean female 		= scanner.nextBoolean();	// load the female variable to a boolean
			double grossIncome  = Double.parseDouble(scanner.next()); // convert the string to a double
			
			// Simply print to the console what we have read
			if(female){
				System.out.printf("Mrs %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
			}
			else{
				System.out.printf("Mr %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
			}
		}
		

	}

}
