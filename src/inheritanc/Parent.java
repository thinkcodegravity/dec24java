package inheritanc;

public class Parent extends GrandParent {	
	public Parent( boolean b) {
		super();// super=GrandParent.. GrandParent()
		System.out.println("Parent");
	}
	
	public int a=10;
	public int b=10;
	public void method1() {
		a=20;
		System.out.println("method1");
	}
}
