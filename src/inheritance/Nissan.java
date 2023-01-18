package inheritance;

public class Nissan extends Cars{
	//runtime overriding polymorphism
	// happens across parent and child program
	public void drive() {
		System.out.println("driving luxury car");
	}
	// compiletime OVERLOADING polymorphism
	// methods with same name but different input
	// can exists in same program
	public void turn(int x ) {
		System.out.println("taking left turn");
	}
	public void turn(boolean b) {
		System.out.println("taking right turn");
	}
}
