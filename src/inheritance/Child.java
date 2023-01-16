package inheritance;

public class Child extends Parent{
	public Child() {
		super(); // super constructor
		System.out.println("constructing Child");

	}	
	int a=20;
	public void test() {
		int a=30;
		System.out.println( a );//local var print
		System.out.println( this.a );// global var print
		System.out.println( super.a );// super var print
		super.test();// super /parent class method
		
	}
}
