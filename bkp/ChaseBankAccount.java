
public class ChaseBankAccount {
	// bankName info is shared by all chase customers
	static String bankName = "chase";
	// different info for each chase bank customers
	String customerName;
	int bankAccount;

	public static void method1() {
		System.out.println(bankName);
	}
	public void method2() {
		System.out.println(bankAccount);
	}
	// does the method definition/body includes
	// reference to non-static variable or methods
	// then this method has to be non-static as well.
	public static void method3() {
		method1();
	}
	public void method4() {
		method2();
	}
	
}
