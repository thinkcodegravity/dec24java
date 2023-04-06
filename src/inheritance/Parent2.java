package inheritance;

public class Parent2 extends GrandParent2{
	public Parent2() {
		super();// construct grandparent first
		System.out.println("Parent is born");
	}
}
