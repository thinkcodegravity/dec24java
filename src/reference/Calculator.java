package reference;

public class Calculator {
	// service provider
	// take input
	// give output
	// method declaration
	// this line takes input 20 and 30
	// input variable keeps 20 and 30
	// a keep 20 and b keeps 30
	public int add(int a, int b) {
		int sum=a+b;
		// int sum=20+30;
		// int sum=50;
		return sum; // return 50;
	}
	// mul takes input 300000 and 5
	// in the order = a get 300000 and b gets 5
	public int mul(int a, int b) {
		int mu=a*b;
		// int mu=300000*5;
		// int mu=1500000;
		return mu; // return 1500000;
		// 
	}
	// div takes input 1500000 and 100
	// in the order... a get 1500000 and b gets 100
	public int div(int a, int b) {
		int di=a/b;
		// int di=1500000/100;
		// int di=15000;
		return di; // return 15000;
	}
	
	
}
