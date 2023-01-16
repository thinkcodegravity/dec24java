package inheritance;

public class Parent extends GrandParent{
	int a=10;
	public Parent() {
		super( "");
		System.out.println("constructing Parent");
	}
	public void test() {
		System.out.println("test method");
	}
}
