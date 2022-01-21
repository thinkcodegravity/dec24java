
public class Car {
	// compiletime polymorphism
	public void drive() {
		System.out.println("driving basic");
	}
	// same name, different input
	public void drive(String s) {
		System.out.println("driving fast");
	}
}
/*
 	development
 	compile = text program into binary program
 	run = machines execute/run your binary program
 */
