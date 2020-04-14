
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Tuner";
		
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for loop :");
	
		for (String student : students) {
			System.out.println(student);
		}
	
	
	}

}