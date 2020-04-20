package week03Hw;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		8.	Write a method that takes two Strings, firstName and lastName, 
		and returns a full name (the full name should be the first and the last name as a String separated by a space).
		*/

		String firstName = "Robb";
		String lastName = "Wells";
		String fullName = firstAndLast(firstName, lastName);		
		
		System.out.println(fullName);
		
	}
				
		public static String firstAndLast(String first, String last)  {
			return first + " " + last;
				
	}

}
