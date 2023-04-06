package inheritance;

public class Child2 extends Parent2{
	public Child2() {
		// Super constructor rules
		// super should be the first line in constructor
		super();//construct parent first
		System.out.println("Child is born");
		
	}
}
