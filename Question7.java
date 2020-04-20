package week03Hw;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		 * to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		 */
		
	
		System.out.println(multiPhrase("Hello ", 3));
		
	}
	
	public static String multiPhrase(String word, int n) {
		
		String phrase = "";
		for (int i = 0; i < n; i++) {
			phrase += word;
		}
		return phrase;
	
		
		
	}

}
