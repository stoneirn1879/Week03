package week03Hw;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/*
		 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
		 * and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		
		boolean temp = true; 
		double money = 11;
		System.out.println(willBuyDrink(temp,money));
		
		
	}
	
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				System.out.println("I will buy a drink");
				return true;
			}
			System.out.println("I will not buy a drink");
			return false;
			
		}
		
		
		
}



