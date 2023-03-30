package variableScop;

public class Person {
// Long term info "Global variable"	
	// specific ... "Instance variable"
	String name="john";
	//String name="jane";
	// shared... "static/class variable"
	static String planet="earth";
	//static String planet="jupiter";
// RULES : cannot have duplicate global variable
// RULES : duplicate allowed between global and local 
	
	// short term info "Local variable"
	// a and b are input variable... "Parameteric variable"
// RULES : input variable cannot have values here
	public int add(int a, int b) {
		String name="jane";
		int sum=0;// defined inside curly bracket
		sum=a+b;
		System.out.println( name );// when dup global and local... local gets prefernece
		System.out.println( this.name );// i know there is dup local variable..
									// but i am intereseted in the one that is global
		
		System.out.println( sum );
		System.out.println( a );
		System.out.println( b );
		return sum;
	}
	
	public void test() {
		System.out.println( name );
		System.out.println( sum );
		System.out.println( a );
		System.out.println( b );
	}
	
}
