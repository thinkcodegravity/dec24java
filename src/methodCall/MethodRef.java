package methodCall;

public class MethodRef {
	public void method1(Person p1) {
		method2(p1);
		p1=new Person();
		p1.name="jane";
		
	}

	public void method2(Person p2) {
		p2.name="mike";
		p2=new Person();
		
		
	}

}
