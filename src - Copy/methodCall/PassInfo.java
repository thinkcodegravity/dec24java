package methodCall;

import jominos.AddressDetails;

// CALLER Program
public class PassInfo {
// debug.
// pause program and verify / debug
	public static void main(String args[]) {
		Calculator c=new Calculator();
		/*
		 PASSING INFO IN METHOD RULES
		 1) if callee program method has 
		 	Primitive/simple data type
		 	Caller program can pass
		 	either matching variable
		 	or matching value
		 2) if callee program method has 
		 	complex data type
		 	Caller program can pass
		 	either matching variable
		 	or null
		 3) if callee program method has 
		 	String data type
		 	Caller program can pass
		 	either matching variable
		 	or null or matching value
		 */
		// SIMPLE/PRIMITIVE INPUT
		int x=30;
		int z=20;
		//		int value , int variable
		int result=c.add(z, x);
		int result2=c.add(1, 3);
		
		// COMPLEX INPUT
		AddressDetails y=new AddressDetails();
		c.test(y); // matching variable. 
					// y data type matches
					// method input
		c.test(null); // null
		
		// STRING INPUT
		String name="john";
		c.test2(null);
		c.test2(name); // mathing variable
		c.test2("jane");// matching value
		
	}
}
