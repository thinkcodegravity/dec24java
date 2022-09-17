package methods;

public class PersonProcess {
	public void method1(Person p1, int a) {
		p1=new Person();
		p1.name="jane";
		a=30;
		method2(p1,a);
	}
	public void method2(Person p2, int b) {
		p2.name="mike";
		b=40;
	}
}
