package stati;

public class ChaseBank {
	public ChaseBank(String cn) {
		customerName=cn;
	}

	
// class member - variables & methods	
// if a method is accessing
// non static class member > NON-static method
// ALL other scenario > Static method
	
	// shared/common info for all ChaseBank types
	public static String bankName="chase"; // static
	// specific info for each ChaseBank type instances/individuals
	public final String customerName; // non-static
	
	public void method1() { // has to be non-static
		System.out.println(customerName);	// accessing non-static	
	}
	public static void method2() {
		// RULE - static member can call ONLY other static members
		System.out.println(bankName); 
		System.out.println(customerName); 
		method1();
		method3();
		method4();
		method5();
	}
	public void method3() { // has to be non-static
		method1(); // accessing non-static
		//RULE - non-static member can call EVERY other member
		System.out.println(bankName); 
		System.out.println(customerName); 
		method1();
		method2();
		method4();
		method5();
	}
	// access modifier : final , static, abstract
		// abstract = applies to methods
		// static = applies to methods and global variable
		// final = applies to all... global/local variable and methods
	// access privilege : public , protected , private
		// applies to methods and global variable
	public static final void method4() {
		final int a=10;
		method2();
	}
	public static void method5() {
		
	}
	

	// UTILITY method...
	// utility tools = screw driver,car
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	
}
