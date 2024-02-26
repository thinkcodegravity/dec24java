package exception;

public class Test {
	public void method1() {
		System.out.println("method1");
		method2();
		System.out.println("method1 exit");
		
	}
	public void method2() {
		System.out.println("method2");
		method3();
		System.out.println("method2 exit");
		
	}
	public void method3() {
		System.out.println("method3");
		method4();
		System.out.println("method3 exit");
		
	}
	public void method4() {
		System.out.println("method4");
		try{
			int x=10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("method4 exit");
		
	}
}
