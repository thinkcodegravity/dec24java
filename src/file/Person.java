package file;

public class Person {
	// specific to each type
	String name;
	// shared between all type of person
	static String planet = "earth";

	public void test() {
		System.out.println(name);
		System.out.println(planet);
	}

	public static void test2() {
		System.out.println(planet);
	}
}
