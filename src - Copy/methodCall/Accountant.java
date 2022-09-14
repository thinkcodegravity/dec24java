package methodCall;

public class Accountant {
	
/*
 Method Call : 
 	communication btw 2 programs
 	exchange information
 	Message passing technique
 Reference call :
 	if method call occurs outside
 	program. create reference/connection
 	to other program
 */
	public static void main(String args[]) {
		int principal=100000;
		int time=30;
		int rateOfInterest=5;
		boolean b=true;
		// P X T X R / 100
		// Accountant program needs Calculator
		// services
		// c reference variable
		Calculator c=new Calculator ();
		int temp1= c.mul(principal, time, b );
/* METHOD CALL RULES 
 		1) spell methodName correctly
 		2) Number of inputs should match 
 			method(mul) input count
 		3) Data type of each input should match
 			method(mul) input data type
 		4) order of each input should match
 			method(mul) input order
 		5) LHS variable data type should match
 			method output data type
 		6) LHS not required if
 			method has void/no output
 */
		int temp2 = c.mul(temp1, rateOfInterest,b);
		int siResult = c.div(temp2, 100);
		int addResult = c.add(temp2, 100);
		int ubResult = c.sub(temp2, 100);
		System.out.println( "your Simple interest is:"+siResult);
		
		
		
		
	}
	
}
