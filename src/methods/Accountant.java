package methods;

public class Accountant {
	
	int x=20;
	
	Calculator c=new Calculator();
	public void doTaxes() {
		System.out.println("accountant doing taxes");
		c.add(10, 20, "john");
		System.out.println("accountant done taxes");
	}
// Customer is using Accountant add service
// Customer will GIVE/PASS INPUT
// Accountant will RECEIVE INPUT
// Accountant will GIVE/PASS OUTPUT
// Customer will RECIEVE OUTPUT
	public int add(int a, int b,String s) {
		int sum=a+b;
		return sum;
		// return letter sum
		// return value of sum variable 
	}
}
