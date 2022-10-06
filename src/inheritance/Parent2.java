package inheritance;

public class Parent2 extends Grandparent2{
	int y=20;
	public Parent2(String s) {
		super();// super() very first line in child constructor
		System.out.println("Parent is born");
	}
}
