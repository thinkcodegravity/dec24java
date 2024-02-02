package methods;

public class MethodStack {
	public Person method1(Person p1) {
		p1 = method2(p1);
		p1.name = "jane";
		return p1;
	}

	public Person method2(Person p2) {
		p2.name = "mike";
		return p2;
	}
}
