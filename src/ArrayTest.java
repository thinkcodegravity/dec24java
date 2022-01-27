
public class ArrayTest {
// setting, configuration
	public static void main(String[] args) {
		for( String s:args) {
			System.out.println(s);
		}
		Person [] facebookCustomers=new Person[100];
		for(int i=0; i < facebookCustomers.length ;i++ )
			facebookCustomers[i]=new Person();
		// enhanced for loop OR for-each
		for( Person p : facebookCustomers) {
			p=new Person();
		}
		// for each will extract each variable(Person in above
		// example) one by one in each loop from the array
		// facebookCustomer(which is a group of OR array of
		// person)
		
		String[] names= {"john","jane","mike"};
		System.out.println(  names.length  );
		System.out.println(  names[1]  );
		
		Student[] school= { new Student(), new Student() };
		
	}

}
