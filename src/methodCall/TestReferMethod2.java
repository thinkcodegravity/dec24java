package methodCall;

public class TestReferMethod2 {

	public static void main(String[] args) {
		ReferenceMethod2 rf2=new ReferenceMethod2 ();
		Person p=new Person();
		System.out.println(p.name);
		rf2.method1(p);
		// method call, method access
		// trasnfers control to the other program
		System.out.println(p.name);
	}

}
