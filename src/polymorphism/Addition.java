package polymorphism;
// 10 , 5 = 15
// john, doe = john doe
public class Addition {
	// compiletime poly = overloading
	// implement = 2 methods with same name and different input
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public String add(String a, String b) {
		String joinedName=a+b;
		return joinedName;
	}
}
