package week03Hw;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	
		
		
		
		
		
		
		/* Learned the join string syntax		        
		String joinedString = String.join(", ", peopleWeKnow);
		 
		System.out.println(joinedString); 
		*/
		
		
		
	
	//3.	How do you access the last element of any array?
	//4.	How do you access the first element of any array?	
		String[] peopleWeKnew = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		String first = peopleWeKnew[0];
		String last = peopleWeKnew[peopleWeKnew.length - 1];
		
		System.out.println(first + " " + last);
		
		
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
	//		created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = {};
		String[] peopleWeKnow1 = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int index = 0;
		
		String person = "";
		
		for (String personName : peopleWeKnow1) {
		//index += index + personName.length();
		System.out.println(personName);
		}
		
		}
		
		
	}


