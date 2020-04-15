
public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Ricky", "Julian", "Bubbles", "Jim", "Randy"};
		System.out.println(countOccurrences(names, "Ricky"));
	}
	
	public static int countOccurrences(String[] strings, String str) {
				
		int sum = 0;				
		for (String s : strings) {
			if (s.equals(str)) {
				sum++;
			}
		}
		return sum;	
	}
		
}
	
