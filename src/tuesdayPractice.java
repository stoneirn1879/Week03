import java.util.Scanner;


public class tuesdayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int Size = 5;    // size of array
		
	      // Create an array to hold employee salary.
		double[] salaries = new double [Size];
		
	      // Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the salaries of " + Size + " employees.");
		
	      // Get employees' salary.
		
		for (int i = 0; i < Size; i++)
		{
		salaries[i] = console.nextDouble();
		}
	      // Display the values stored in the array.
	      System.out.println("The salaries are:");
	      for (int i = 0; i < Size; i++)
	      {
	    	  System.out.println(salaries[i]);
	      }
	      
	}

}
