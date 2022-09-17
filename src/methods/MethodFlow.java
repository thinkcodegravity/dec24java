package methods;
// callee
// provider
// publishers
public class MethodFlow {
	public void method1() {
		System.out.println("entering method 1");
		method2(); // method call within same program
		System.out.println("exiting method 1");
	}
	public void method2() {
		System.out.println("entering method 2");
		method3();// method call within same program
		System.out.println("exiting method 2");
	}
	public void method3() {
		System.out.println("entering method 3");
		System.out.println("exiting method 3");
	}
}
//Method stack - LIFO
