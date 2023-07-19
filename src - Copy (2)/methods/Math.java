package methods;

import dominos.Address;

public class Math {
	// Is java pass by value or pass by reference
	// ALWAYS a PASS BY VALUE
	// receive input

	// method declaration=providing service/functionality
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
		// gives output
	}
	public void changeAddress(int p,Address ad) {
		System.out.println("changing address");
	}
}
