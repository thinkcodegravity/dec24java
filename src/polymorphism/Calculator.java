package polymorphism;

public class Calculator {
/* compile time poly : OVERLOADED
 	1) name of method should be same
 	2) input has to be different
 */
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int add(int x, int y,int z) {
		int sum=x+y+z;
		return sum;
	}
	public float add(float a, float b ) {
		float sum=a+b;
		return sum;
	}
	public String add(String a, String b) {
		String joinedName=a+b;
		return joinedName;
	}
}
