package reference;

public class TestReference {

	public static void main(String[] args) {
		
		// simple primitive data type
		int x=10;
		// connection/refernce/ pointer
		// reference data type
		FacebookCustomer fb1=new FacebookCustomer();
		// fb1 = reference variable
		// sysout = print value of a variable
		System.out.println(  fb1.name );  
		System.out.println(  fb1.age );  
		
		System.out.println( Runtime.getRuntime().totalMemory() );
		System.out.println( Runtime.getRuntime().freeMemory() );
// 300 KB
		// 128 mb - 127.6mb
	}

}
