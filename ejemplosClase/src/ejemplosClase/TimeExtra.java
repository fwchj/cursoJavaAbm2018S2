package ejemplosClase;
import java.util.Scanner;

public class TimeExtra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Display a message to the user and instruct him/her what to do. 
		System.out.print("Please indicate your time zone as compared to UTC.\n");
		System.out.print("For example:\n\t if you are living in Central Europe (UTC+1), indicate 1.\n");
		System.out.print("\t if you are living in Mexico (UTC-6), indicate -6\n");
		System.out.print("Your input:");

		int diff = input.nextInt(); // Cast the input to an integer
		
		
		long totalMilliseconds = System.currentTimeMillis();	
		long seconds = totalMilliseconds / 1000 % 60;
		long minutes = totalMilliseconds / 1000 / 60 % 60;
		long hours = totalMilliseconds / 1000 / 60 / 60 % 24;
		
		// Adapt the hours
		hours +=diff;	// Adding the difference to match the time zone
		if(hours<0){	// Ensure that we don't have negative values (happens when one day behind UTC)
			hours+=24;
		}
		else if(hours>24){	// Ensure that we don't have values >24 (happens when one day ahead of UTC)
			hours-=24;
		}
		
		// In order to nicely display the time zone, we distinguish the output for positive and negative values
		if(diff>=0){
			System.out.printf("The time in the selected time zone (UTC+%s) is: %02d:%02d:%02d \n",diff,hours,minutes,seconds);
		}
		else{
			System.out.printf("The time in the selected time zone (UTC%s) is: %02d:%02d:%02d \n",diff,hours,minutes,seconds);
		}
		
		
	}

}
