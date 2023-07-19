package polymorphism;

public class Ferrari extends Car {
	//Overriding rules
	/*
	 public > protected > default > private
	 1) happens acros parent and child
	 2) exact same method signature
	 3) child method cannot be more restrctive in access privilege
	 */
	 public void drive() {
		System.out.println("better and faster drive");
	}
}
