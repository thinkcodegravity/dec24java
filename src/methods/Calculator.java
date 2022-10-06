package methods;

public class Calculator {
	public int add(int a, int b,String c) {
		System.out.println( b );
		return a+b;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int mul(int p, int q) {
		return p * q;
	}
// compiler provides default construsctor
// that has NO input
// that does NOTHING
// it is provided ONLY if no constrcutor
// defined
	public Calculator() {
		
	}
}
