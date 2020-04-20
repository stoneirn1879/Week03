package week03Hw;

public class Question3and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Creation
				int[] numberedArray = {3, 9, 23, 64, 2, 8, 28, 93, 39}; 
				//added 39 to array to check dynamic functionality to new elements
				//create a variable to store the first and last number of the array
				int first = numberedArray[0];
				int last = numberedArray[numberedArray.length-1]; 
				//print out the subtraction operation using the stored variables
				System.out.println(last - first);
		
		
	}

}
