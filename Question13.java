package week03Hw;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// I created a system to check if the weather is good for the pool, using a cold, warm, hot scale and user input based on the local temperature
		Scanner runTemp = new Scanner(System.in);
		System.out.println("Enter today's temperature");
		
		int temperatureIs = runTemp.nextInt();
				
		System.out.println(willIGoSwimming(temperatureIs));
		
	}
	
	
	public static String willIGoSwimming(int todaysTemp) {
		
		String cold = "It is to cold to go swimming";
		String warm = "It is warm, but not enough to swim";
		String hot = "It's hot! I am going in the pool!";
		
		if (todaysTemp < 70) {
			return cold;
		}
		else {
			if ( todaysTemp <= 90) {
				return warm;
			} 
				return hot;
			}
		
	}
}