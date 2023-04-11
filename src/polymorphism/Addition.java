package polymorphism;

public class Addition {
	// 
	// compiletime poly = overloading
	// 1) mutliple methods with exact same name
	// 2) these methods can be in same class or
	// 		parent-child combo
	// 3) input has to be different
	
	
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public String add(String a, String b) {
		String joinedName=a+b;
		return joinedName;
	}
}
