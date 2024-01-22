package variableScope;

public class Person {
	// Global variable can be accessed within and outside program
	// HAS-A
	// specific / personal info
	// "instance" variable
	String name="john";
	short age;
	String city;
	long phoneNumber;
	String email;
	
	
	// shared info with EVERY Person
	// "class/static" variable
	static String planet="EARTH";
	static String species;
	
	// "parametric" / input variable = a and b
	// RULE : do not store value for paramteric variable
	// value/info is given to by externally
	public int add(int number1, int number2) {
		System.out.println( number1);
		System.out.println(name);
		System.out.println(planet);
		// "local variable"
		// found inside a curly bracket
		int x=0;
		System.out.println( x );
		int y=1;
		{
			
		}
		return 10;
	}
	
	public int sub(int digit1, int digit2) {
		
		System.out.println( number1 );
		System.out.println( x );
		System.out.println(name);
		System.out.println(planet);
		
		return 5;
	}
	
	
}
