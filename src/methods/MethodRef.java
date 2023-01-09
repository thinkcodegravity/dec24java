package methods;

public class MethodRef {
	// method declaration
	public void method1(Person p1, int a) {
		// method body/method definition
		a=10;
		method2(p1,a);
		p1.name="jane";
		
	}

	public void method2(Person p2,int b) {
		b=20;
		method3(p2,b);
		p2.name="mike";
		
	}

	public void method3(Person p3,int c) {
		c=30;
		p3.name="andy";
		p3=new Person();
		
	}
}
