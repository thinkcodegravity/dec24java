package reference;

public class MethodControl {
	public void method1() {
		System.out.println( "enter method1");
		method2(); // paused
		System.out.println( "exit method1");
	}
	public void method2() {
		System.out.println( "enter method2");
		method3();//paused
		System.out.println( "exit method2");
	}
	public void method3() {
		System.out.println( "enter method3");
		System.out.println( "exit method3");
	}
}
