package polymorphism;

public class TestPoly {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		// method name conflict is resolved
		// during the compile time itself
		// based on input
		System.out.println( c.add(12,20) );
		System.out.println( c.add("john","doe","ny") );
		
	}

}
