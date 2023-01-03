package methods;

public class Calculator {
//  access  return_type	method_name (input)
	public 	int 		addition 	(int number1, int number2) {
		
		
		int result1=10;
		String result2="john";
		return result1; // variable of same return type(int)
	}
	
	public int add(int a, int b,String c) {
		System.out.println( b );
		return a+b;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int mul(int p, int q) {
		return p * q;
	}
// compiler provides default construsctor
// that has NO input
// that does NOTHING
// it is provided ONLY if no constrcutor
// defined
	public Calculator() {
		
	}
}
