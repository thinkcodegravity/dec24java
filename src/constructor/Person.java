package constructor;

public class Person {
	String name="john";
	
	public int add(int a, int b) {
		return a+b;
	}
	// IF no constructor is provided in the program
	// compiler will add default constuctor
	// without ur knowledge
	
	public Person() {
		
	}
}
