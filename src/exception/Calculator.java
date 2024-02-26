package exception;

public class Calculator {
	// div ( 20/0 );
	public int div(int a, int b) {
		System.out.println("welcome to calculator software");
		int result=0;
		try {
			System.out.println("starting to divide");
			result=a/b; // suspect might fail
			System.out.println("completed divide");
			
		}
		catch(Exception e) {
			
			//e.printStackTrace();
		// NOT GUARANTEED : only used if program fails	
			System.out.println("failed divide");
			// take action or give instructions to customer
			// on why program failed
			// and what to do to avoid this mistake
			System.out.println("Please do not divide a number by zero");
			throw e;
		}
		finally {
			// guaranteed code
			System.out.println("thank you for using our calculator");
		}
		return result;
	}
}
