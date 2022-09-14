package references;

public class TestReference {

	public static void main(String[] args) {
		Person p = new Person();
		// p =reference, pointer, connection
		// dot operator = allows to access content
		// from another program using reference
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.weight);
	}

	public void method1(int a) {
		method2(20);
		method3(20);
		method4(20);
	}
	// 	STATIC to STATIC limitation
	public static void method2(int a) {
		//method1(10); // within static method u 
					// can only call other static method
		//method3(10);
		method4(20);
	}
	public void method3(int a) {

	}
	public static void method4(int a) {

	}

}
