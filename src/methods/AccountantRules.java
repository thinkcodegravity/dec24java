package methods;

public class AccountantRules {
	public static void main(String[] arg) {
		Calculator cal=new Calculator();
		// consumes/uses/needs addition service
//	PASSING INPUT
		// 1) number of input should match
		// 2) data type of input should match
		// 3) order of input should match
		
		// if service requires primitive input
		// pass matching values OR matching variable
		
		// if service requires complex input
		// pass null OR matching variable
			
		
		// if service requires complex String input
		// pass null OR matching value OR matching variable
		
		int x=20;
		String y="john";
	// METHOD CALL
		int result=cal.add(15,x ,y);
		System.out.println(" output is :"+result);
// HANDLING OUTPUT/RETURN TYPE	
// LHS declare a variable 
// whose data type matches
// the service output data type
		
		//  cal.add(15,20,"john");	
		// IS Java by pass by value of reference
		// PASS by VALUE		
		
		
	}
}
