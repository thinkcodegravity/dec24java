package statc;

public class ChaseBank {
	public static String companyName = "Chase";
	public int acctNum;
// static member can access other static member
	public static void method1() {
		method2(); // static
		method3(); // non-static
		method4(); // non-static
		System.out.println(companyName); // static
		System.out.println(acctNum); // non-static
	}
	public static void method2() {

	}
	public void method3() {

	}
	// no restrictions on non-static members
	public void method4() {
		method1();
		method2();
		method3();
		System.out.println(companyName);
		System.out.println(acctNum);
	}


	public String customerName;

	public ChaseBank(String cn, int an) {
		acctNum = an;
		customerName = cn;
	}

	// static member can access other static member
	public static int add(int a, int b) {
		return a + b;
	}

	public void withdraw(int amount) {
		System.out.println("withdraw money");
	}

	
}
