package solucionesTareas;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// Load the system scanner for user input 
		Scanner scanner = new Scanner(System.in);
		
		// Ask user how many times to roll the dice
		System.out.println("How many times should I roll the dice?");
		int numberRolls = scanner.nextInt(); // get the info on how many rolls
		
		int even = 0; // define the counter for even rolls
		
		for(int i=1;i<=numberRolls;i++){ // Loop for n times
			// Here I use the Math.ceil to avoid the zeros. 
			int result = (int) Math.ceil(Math.random()*6);
			//System.out.println(result); // Simply prints the result to the console
			
			if(result%2==0) { // here we check if it's even
				even++;
			}
			
					
		}
		
		//Display the results. The number of odd rolls is simply n-even
		System.out.printf("We have %s odd rolls and %s even rolls, this is %5.2f %% of even rolls \n",numberRolls-even,even,(double)100*even/numberRolls);
	}	

}
