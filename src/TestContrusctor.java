
public class TestContrusctor {

	public static void main(String[] args) {
		Student s=new Student();
		
		//	constructor call	
		Customer c1=new Customer("jane");
		// name jane, age 0, city null, addr null
		
		Customer c2=new Customer("mike",15);
		// name mike, age 15, city null, addr null
		
		Address a=new Address(12345);
		int x=10;
		Customer c3=new Customer("andy",x,"new york",a);
		// name mike, age 15, city newyork
		
		System.out.println(c1.addr);
		System.out.println(c2.addr);
		System.out.println(c3.addr);
	}

}
