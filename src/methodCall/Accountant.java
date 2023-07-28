package methodCall;

public class Accountant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator c=new Calculator();
		// method calls
		// communicate between programs
		// Method call RULES
		/*
		 1) name of method - perfect match
		 2) number of inputs should match
		 3) data type of input should match
		 4) order of input should match
		 5) data type of output should match 
		 */
		c.test(345);
		
		int result=c.add( 4,5,"john");
		
		System.out.println(result);
	}

}
