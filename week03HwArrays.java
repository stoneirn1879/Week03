package week03Hw;

public class week03HwArrays {

	public static <sum> void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			a.	Programmatically subtract the value of the first element in the array from the value in the last element
			 of the array (do not type ANY numbers in the operation, ages[7] – ages[0] is not allowed). Print the result to the console.
			b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 * 
		 */
		// Array Creation
		int[] numberedArray = {3, 9, 23, 64, 2, 8, 28, 93, 39}; 
		//added 39 to array to check dynamic functionality to new elements
		//create a variable to store the first and last number of the array
		int first = numberedArray[0];
		int last = numberedArray[numberedArray.length-1]; 
		//print out the subtraction operation using the stored variables
		System.out.println(last - first);
		//create variables to hold values 
		int i, sum, avg;
		sum = 0;
		//as long as i equals less than the number of elements in the array count 1
		
		for (i = 0; i < numberedArray.length; i++) {
		//sum equals sum plus the current index of the array
			sum += numberedArray[i];
		}
		// avg = sum divided by array length
		avg = sum / numberedArray.length;
		System.out.println("The average age is: " + avg);
			
		}
		
		
	}	
		

		