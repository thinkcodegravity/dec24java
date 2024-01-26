package methods;

public class Accountant {

	public static void main(String[] args) {
		
		int subResult=sub(12,5);// sub method is in same program
								// no outside refernce needed
		
		//Accountant HAS-A Calculator
		Calculator cal=new Calculator();
		// method call/ method invocation
		int x=12;
		int addResult=cal.add(x,5,"john");// add is in outside calculate program
		// pass by value... cal.add(x,5,"john") .. cal.add(12,5,"john")
		System.out.println( addResult );
		// cal = provides reference to the calculator program
		
		// method call
		// This Accountant program USES add service
		// provided by calculator program
		// cal.add(12, 5);
		// RULES
		/* 
		 Method call = cal.add and sub
		 1) name of service should match(case sensitive)
		 2) sub(12,5) = service/method if in the same program , does not need reference
		 3) cal.add(12, 5) = service/method is in outside program. need reference to that outside program
		
		 input = x,5,"john"
		 1) number of input shuld match EXACTLY
		 2) datatype of input should match
		 3) order of input should match
		 4) input can be variable or value
		 
		 output = int addResult
		 1) Datatype of response variable should match
		 	output of the service called/used
		 */
	}
	public static int sub(int a, int b) {
		return a-b;
	}

}
