package ejemplosClase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	
	
	
	public static void main(String[] args) {
		// We define a parser (similar to scanner in Java.io)
		JSONParser parser = new JSONParser();
		try {
			
			// Here we load the data into an object (in fact it's like a String here
			Object obj = parser.parse(new FileReader("workers.json"));
			
			// Optional: print the imported string (don't do this when you work with large files ;-) )
			System.out.println(obj);
			
			// Now we cast this undefined object to a JSONObject (requires org.json.simple package)
			JSONObject firm  =  (JSONObject) obj;
			
			// From a JSONObject we can directly obtain level 1 elements (here the name of the company)
			String name = (String) firm.get("CompanyName"); 			// get the value
			System.out.printf("The name of the firm is: %s\n",name);	// Print the value to the console
			
			
			// Now we aim at looping through the workers. First, let's obtain the array of workers
			JSONArray workers = (JSONArray) firm.get("Employee"); // Obtain the array and store as JSONArray
			
			for(Object w:workers){ // loop over all elements in the array
				JSONObject worker = (JSONObject) w;		// To extract information, we have to cast it to a JSONObject 
				String givenName = (String) worker.get("Name");			// Extract name (String)
				String familyName = (String) worker.get("FamilyName");
				double grossIncome = Double.parseDouble((String)worker.get("GrossSalary")); // Extract and parse to double
				boolean female =Boolean.parseBoolean((String) worker.get("Female"));
				int age = Integer.parseInt((String) worker.get("Age"));
				
				// Simply print to the console what we have read
    			if(female){
    				System.out.printf("Mrs %s %s is %s years old and earns %9.2f dolars (gross)\n",givenName,familyName,age,grossIncome);
    			}
    			else{
    				System.out.printf("Mr %s %s is %s years old and earns %9.2f dolars (gross)\n",givenName,familyName,age,grossIncome);
    			}
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, I couldn't find the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Opps, something went wrong when I tried to read the file");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Opps, I did not understand the file");
			e.printStackTrace();
		}
		
		


}
}
