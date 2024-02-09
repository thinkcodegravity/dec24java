package inheritanc;

public class Parent extends GrandParent{
	public Parent() {
		super("john");// public GrandParent("john")
		System.out.println("parent is born");
	}
	
	
	
	int b=10;
	int x=20;
	public void test2() {
		System.out.println("test2");
	}
}
