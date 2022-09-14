package Inheritance;
//3 variablae & method
public class Child extends Parent {
	int b=30;
	int x=50;
	public Child() {
		super();
		System.out.println("child constructor");
	}
	public void method2() {
		int x=60;
		System.out.println(x);// 60(local)
		System.out.println( this.x );// 50(global)
		System.out.println( super.x );// 40(parent global)
		System.out.println("child method2");
	}
}
