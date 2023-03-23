package dominos;

public class Restaurant {
	//HAS-A
	int a;//default value 0
	float b;// 0.0
	boolean c;// false
	char d;
	String e;
	Address	address;
	
	String	name="dominos";
	
	long	phone=123123123;
	Customer	customers;
	Employee	employee;
	Food	food;

	//DOES-A
	public void open() {
		System.out.println( name );
	}
	public void takeOrders() {
		
	}
}
