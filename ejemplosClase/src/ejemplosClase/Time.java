package ejemplosClase;
public class Time {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		
		totalMilliseconds -=1000*60*60*5;
		long seconds = totalMilliseconds / 1000 % 60;
		long minutes = totalMilliseconds / 1000 / 60 % 60;
		long hours 	 = totalMilliseconds / (1000 * 60 * 60) % 24;
		
		System.out.printf("It is %02	d:%02d:%02d (Mexico City Time)\n",hours,minutes,seconds);
		
		
		

	}

}
