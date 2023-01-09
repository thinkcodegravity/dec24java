package methods;

public class MethodFlow {
	public void method1() {
		System.out.println("method1 start");
		method2(); // internal method call
		System.out.println("method1 end");
	}
	public void method2() {
		System.out.println("method2 start");
		method3();
		System.out.println("method2 end");
	}
	public void method3() {
		System.out.println("method3 start");
		method4();
		System.out.println("method3 end");
	}
	public void method4() {
		System.out.println("method4 start");
		System.out.println("method4 end");
	}
	
}
