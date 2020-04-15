
public class tuesdayMoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We create Arrays to work with multiple variables of the same type and purpose
		
		String studentName1 = "Mike Smith";
		String studentName2 = "Robb Wells";
		String studentName3 = "John Paul Tremblay";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		//imagine 10 or more entries
		
		//example Array
		/*
		String[] students = new String[3];
		
		students[0] = "Mike Smith";
		students[1] = "Robb Wells";
		students[2]	= "John Paul Tremblay";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		*/
		String[] trailerParkBoys = new String[5];
		
		trailerParkBoys[0] = "Bubbles";
		trailerParkBoys[1] = "Ricky";
		trailerParkBoys[2] = "Julian";
		trailerParkBoys[3] = "Mr.Lahey";
		trailerParkBoys[4] = "Randy";
		
		for (int i = 0; i < trailerParkBoys.length; i++) {		
			System.out.println(trailerParkBoys[i]);
		}

		for (String trailerParkBoy : trailerParkBoys) {
			System.out.println(trailerParkBoy);
		}
	}

}
