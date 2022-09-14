package methodCall;

public class ReferenceMethod2 {

	public void method1(Person p1) {
		method2(p1);
		p1.name="jane";
	}

	public void method2(Person p2) {
		Person p22=new Person();
		p22.name="andy";
		method3(p2);
		p2.name=p22.name;
	}

	public void method3(Person p3) {
		p3=new Person();
		p3.name="mike";
	}
	
}
