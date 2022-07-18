package methodCall;

import jominos.AddressDetails;

// CALLEE program
public class Calculator {
	// Pre-defined/ inbuilt data type
	public int add(int a, int b) {
		return a+b;
	}
	// Pre-defined/ inbuilt data type
	public void test2(String s){
		System.out.println("test2");
	}
	// User defined data type
	public void test(AddressDetails a) {
		System.out.println("test");
	}
	public int sub(int a, int b) {
		return a-b;
	}
	// method/service
	public int mul(int a, int b, boolean x) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	
	public void methodX() {
		int x=10;
		int y=20;
		// dont need a reference
		// when method call within same
		// program
		int divResult=div(x,y);
		int addresult=add(x,y);
		int subRes=sub(x,y);
		
		
	}
	
	/*
	 direct call - if method call occurs within same 
	 program 
	 */
	
	
}
