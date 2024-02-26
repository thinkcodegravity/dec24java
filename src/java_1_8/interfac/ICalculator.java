package java_1_8.interfac;

public interface ICalculator {
	public int add(int a,int b, int c);
	default int sub(int x,int y,int z) {
		return x-y-z;
	}
	static void print() {
		System.out.println("hello");
	}
}
