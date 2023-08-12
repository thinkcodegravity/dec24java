package stati;

public class StaticTest {

	public static void main(String[] args) {
		
		ChaseBank.bankName="abcd";
		int sum=ChaseBank.add(10, 20);
	
		
		ChaseBank customer1=new ChaseBank("john");
		ChaseBank customer2=new ChaseBank("jane");
		ChaseBank customer3=new ChaseBank("mike");
		customer1.customerName="johnathan";
		// by referring static variable by class name
		// it is clear the changes done below
		// will reflect to every ref variable of
		// chaseBank data type
		ChaseBank.bankName="abcd";
		System.out.println(customer1.customerName);
		System.out.println(customer2.customerName);
		System.out.println(customer3.customerName);
		System.out.println(customer1.bankName);
		System.out.println(customer2.bankName);
		System.out.println(customer3.bankName);
		
	}

}
