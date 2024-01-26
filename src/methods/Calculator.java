package methods;

public class Calculator {
	// provides addition method/ service/functionality/action
	public int add(int a , int b, String c) {
		int sum=a+b; // int sum=12+5 // int sum=17
		return sum; // pass by value.. return sum... return 17
	}
	public int sub(int x, int y) {
		int sub=x-y;
		return sub;
	}
	public int mul(int p, int q) {
		int prod=p*q;// int prod=10000*12// int prod = 120000
		return prod;// return 120000
	}
	public int div(int g, int h) {
		int divRes=g/h;
		return divRes;
	}
	
}
