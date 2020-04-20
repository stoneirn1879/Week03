package week03Hw;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	
	
		double[] myArray = {34.343, 78.99, 789.899, 678.323};
		
		System.out.println(averageElements(myArray));
		
	
	
	}
	
	public static double averageElements(double[] entries) {
		
		double sum = 0;
		
		for (double number : entries) {
			sum += number;
			
	}
		return (sum / entries.length);

}

}