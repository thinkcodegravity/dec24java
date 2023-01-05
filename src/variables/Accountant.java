package variables;

import restaurant.CC;

public class Accountant {
	
	// Accountant HAS-A Calculator
	// Accountant is Depended on Calculator
// c - refernece variable
// c gives us connection/refernece to the
// other program
	
	public static void main(String [] args) {
		Calculator c=new Calculator();
		
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
		System.out.println(c.e);
		System.out.println(c.f);
		
		int result=c.add(10, 21);
		
		//System.out.println(result);
		
	}
	
}
