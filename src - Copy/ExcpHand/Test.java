package ExcpHand;

public class Test {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println( "hi ");
		// optional execution= if try block fails.. remaining lines
		// post failed line will be skipped
		try {
			System.out.println( " entered try");
			int c=a/b; // if division is being done with 0
			// program will fail
			System.out.println( " exiting try");
		}
		// damage control. safety net...
		// optional execution = executed ONLY if try block fails
		catch(Exception e) {
			System.out.println(" please do not divide any number by zero");
		}	
		// guarantteed execution
		finally {
			System.out.println("Thank you for using our calculator software");
		}
		
	}

}



