package methods;

import restaurant.Addr;

public class Test1 {
	
	// simple / primitive data type
	int a;
	float b;
	boolean c;
	double d;
	char e;
	// complex / Object data type
	String f;
	Addr g;
	
	// method declaration
	public	int		addition		(int number1 , int number2) {
		// method definition/ method body
		// code for addition
		// control flow , operators , variables
		// return statements - return output to your customers
		int x=10;
		String y="20";
		boolean z=true;
		// if output type is simple ( int , float, double, etc)
		// 1) return any matching value = numeric data type in output... numeric value in return
		//		return 20;
		// 2) return any matching variable
		return x;
	}
	
	// method declaration
	public	float		square		(int number) {
		// method definition/ method body
		// code for calculating square
		float a=10.0f;
		boolean b=true;
		String c="12.2";
		
		return a;
	}
	
	// method declaration
	public	boolean	login			(String email, String password) {
		return true;
	}
	
	// 0 output example
	public void	deposit		(int amount) {
		
	}
	
	// 0 input
	public int charity(  ) {
		return 100;
	}
	// multiple output
	public	AllMathOutput allBasicMathOperation(int number1, int number2) {
		// if output type is complex 
		// 1) return null;
		// 2) return any matching variable
		int a=10;
		String b="20";
		AllMathOutput c=new AllMathOutput();
		return c;
	}
	
	public String getAddress(String name) {
		return null;
	}
}
