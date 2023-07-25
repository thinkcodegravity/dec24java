package references;

public class School {

	public static void main(String[] args) {
		// x is a primitive variable
		int x=10;
		x=25;
		
		// variable should exist in this program
		System.out.println( x );
		
		// s1 is a reference variable
		Student s1=new Student();
		// variable from other program should be referenced
 		System.out.println( s1.grade); // reading
		s1.grade=4; // updating
		System.out.println( s1.grade);
		
 	}

}
