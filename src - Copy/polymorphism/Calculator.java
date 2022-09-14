package polymorphism;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public String add(String a, String b) {
		return a+b;
	}
	public String add(String a, String b,String c) {
		return a+b+c;
	}
	public float add(float x, float y) {
		return x+y;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}
