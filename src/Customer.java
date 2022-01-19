
public class Customer {
	public String name="john";
	public int age;
	public String city;
	public Address addr;
	
	// constructor
	// initialize custom values to global variable
	public Customer(String n) {
		name=n;
		System.out.println("called constructor 1");
	}
	// constructor
	public Customer(String n,int a) {
		name=n;
		age=a;
		System.out.println("called constructor 2");
	}
	// constructor
	public Customer(String n,int a,String c) {
		name=n;
		age=a;
		city=c;
		System.out.println("called constructor 3");

	}
	// constructor
	public Customer(String n,int a,String c,Address ad) {
		name=n;
		age=a;
		city=c;
		addr=ad;
		System.out.println("called constructor 3");

	}
	
}
