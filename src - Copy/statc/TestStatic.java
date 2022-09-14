package statc;

public class TestStatic {

	public static void main(String[] args) {
		ChaseBank customer1=new ChaseBank("john",123);
		ChaseBank customer2=new ChaseBank("jane",111);
		ChaseBank customer3=new ChaseBank("mike",222);
		ChaseBank.companyName="jp morgran";
		customer1.customerName="johnathan";
		
		System.out.println(customer1.customerName);
		System.out.println(ChaseBank.companyName);
		
		System.out.println(customer2.customerName);
		System.out.println(ChaseBank.companyName);
		
	}

}
