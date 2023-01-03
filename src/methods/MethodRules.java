package methods;

public class MethodRules {
	
//  access  return_type	method_name (input)
	public int addition (int number1, int number2) {
		int result1=10;
		String result2="john";
		return result1; // variable of same return type(int)
	}
	public int substraction (int number1, int number2) {
		return 12;// value of same return type(int)
	}
	public void multiplication(int number1, int number2) {
		// no return statement since it is void
	}
	public Person test1() {
		Person result1=new Person();
		String name="john";
		return result1;
	}
	public Person test2() {
		return null;
	}
	
}
