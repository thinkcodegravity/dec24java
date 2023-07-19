package methods;

import dominos.Address;

public class Calculator {

	// Rules on Output RETURN
	/*
	 	1) return statement is mandatory if output is anything other than void.
	 		void means no output... means nothing expected to return
	 	2) output and returned value should match
	 	3) output can be primitive/simple/purple colored OR object/complex/black colored
	 		3a) if primitive : RETURN Either direct/literal value or variable of same type
	 		3b) if object : RETURN either null or variable of same type
	 */
	// callee method
	public int add(int a, int b,String c) {
		System.out.println("");
		int x=30;
		boolean y=true;
		String z="john";
		return x; // return matching data type variable
		// return 30;
		// RETURN VALUE THAT X HOLDS
	}
	public int sub(int a, int b) {
		return 20; // return literal matching value
	}
	public int mul(int a, int b) {
		return 30;
	}
	public Address getAddress() {
		int x=30;
		boolean y=true;
		String z="john";
		Address p=new Address();
		return p;
	}
	
}
