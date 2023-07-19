package reference;

public class TestMethodReference {
	// p1=#123
	public void method1(int x,Person p1) {
		
		p1.name="jane";
		x=20;
		method2(x,p1);// method2(#123)
	}
	// p2=#123
	public void method2(int y,Person p2) {
		p2.name="andy";
		p2=new Person();
		y=30;
	}
	
}
