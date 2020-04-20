package week03Hw;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*9.	Write a method that takes an array of int and returns true 
		 * if the sum of all the ints in the array is greater than 100. 
		 */
		
		int[] myNumbers = {5, 6, 7, 3, 5};
		
		//int sum = trueArrays(myNumbers);
		
		System.out.println(trueArrays(myNumbers));
		
	}
		
	public static boolean trueArrays(int[] numbers) {
		
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		if (sum / numbers.length > 100) {
			return true;
		}
		return false;
		
	}

}
