package inheritance;

public class Child extends Parent{
	
	int x=20;
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int sub(int a, int b) {
		add(10,20);// default access to child's add method
		super.add(10,20);// exclusively access parent add
		int x=10;
		System.out.println( x );// local
		System.out.println( this.x );// global
		System.out.println( super.x );// parent global
		System.out.println( z );// parent global
		return a-b;
	}
}
