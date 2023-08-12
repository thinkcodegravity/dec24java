package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("hi");
		try {
			int i=10/0; // arithmeticException
			String name="john";
			System.out.println(name.charAt(5)); // string relation failure
			// suspect this line might fail
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("string problem");
		}
		catch(ArithmeticException e) {
			System.out.println("mathematical problem");
		}
		System.out.println("bye");
		
	}

}
