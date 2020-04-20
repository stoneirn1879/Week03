package week03Hw;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 11.	Write a method that takes two arrays of double and returns true if the average of the elements
		 *  in the first array is greater than the average of the elements in the second array.
		 */
		
	double[] myNumbers = {5.564, 6.487, 7.753, 3.01, 5.57};
	double[] yourNumbers = {1.7984, 3.4648, 5.49684, 6.6496, 7.05};  	
				
		System.out.println(avgArrays(myNumbers, yourNumbers));
		
	}
		
	public static boolean avgArrays(double[] playerOne, double[] playerTwo) {
		
		double sum = 0;
		double sum1 = 0;
		
		for (double number : playerOne) {
			sum += number;
	
			for (double number1 : playerTwo)	
			sum1 += number1;
		}
		//System.out.println(sum/playerOne.length);
		// Testing to see why this is keeps showing false.  sum1 is not dividing by the length of the 2nd array adding up to the total of the
		// Array instead. sum correctly divides down to the avg
		System.out.println(sum1/playerTwo.length);
		if (sum / playerOne.length > sum1 / playerTwo.length) {
			return true;
		}
			return false;
			
	}

}
