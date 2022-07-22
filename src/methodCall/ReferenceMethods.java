package methodCall;

public class ReferenceMethods {
	// method declaration
	public int method1(int a, Person p1) {
		int x=20; // variable decl and Init
		method2(x, p1); // method call 
		return a; // return statement
	}
	public void method2(int a, Person p2) {
		method3(a, p2);
		p2=new Person();
		p2.name="jane";
		p2.age=15;
	}
	public void method3(int a, Person p3) {
		//p3=new Person();
		p3.name="mike";
		p3.age=10;
	}
}
