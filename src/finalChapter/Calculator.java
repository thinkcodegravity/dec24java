package finalChapter;
public final class Calculator {
	final int x=10; // cannot change
	
	// perfect method solution
	public final int add(int a,int b) {
		// x=20;// changing variable value
		int sum=a+b;
		return sum;
	}
	
	public  int sub(int a,int b) {
		// x=20;// changing variable value
		int sub=a-b;
		return sub;
	}
	
	public  int mul(int a,int b) {
		// x=20;// changing variable value
		int mul=a*b;
		return mul;
	}
	public  int div(int a,int b) {
		// x=20;// changing variable value
		int div=a/b;
		return div;
	}
	
}
