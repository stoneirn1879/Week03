package week03Hw;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and 
		print the result to the console.
		*/
		
		String[] peopleWeKnow = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
					
		float sum = 0;
				
		for (String name: peopleWeKnow) {
			sum += name.length();
			//sum = sum + name.length();
			//System.out.println(sum);
		}
		
		System.out.println(sum / peopleWeKnow.length);		
		//System.out.println(sum / 6); - thinking about this it makes no sense since we won't always know the length
		//in the array.  So I changed it to divide by array length which can be anything depending on the application.
		
		String allNames = "";
		
		// for each item/value in array...
		for (String person : peopleWeKnow) {
			// allNames += person ;
			allNames = allNames + person + " ";			
		}
		System.out.println(allNames);
		
		
		
	}

}
