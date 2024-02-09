package inheritanc;

public class Child2 extends Parent{
	
	public Child2() {
		super();
		System.out.println("child is born");
		System.out.println("child is walk");
		System.out.println("child is play");
		
	}
	
	
	
	
	int c=30;
	int x=10;
	public void test3() {
		int x=5;
		System.out.println( x );// 5
		System.out.println( this.x); // 10
		System.out.println( super.x );// 20
		System.out.println( b );
		
		System.out.println("test3");
	}
}
