
public class TestInheritance {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		String c="john";
		a=b; // LHS / rhs data type should match
		test( a  ); // method call should pass same data type
		
		Iphone i=new Iphone();
		Iphone3 i3=new Iphone3();
		Iphone5 i5=new Iphone5();
		i=i3; // RHS can be child of LHS ALSO
		i.call();
		i.text();
		//i.browse();
		// check the real content/object under i variable
		if( i instanceof Iphone3)
			((Iphone3)i).browse();
		// type casting.. unlock hidden feature inside
		
		
		testIphone( i5 ); // you can pass child data type ALSO
	}
	public static void testIphone(Iphone3 ii) {
		
	}
	public static void test(int x) {
		
	}
}
