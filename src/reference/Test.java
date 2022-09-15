package reference;

public class Test {

	public static void main(String[] args) {
		FacebookCustomer fb1=new FacebookCustomer();	
		FacebookCustomer fb2=new FacebookCustomer();	
		fb1=fb2;
		fb2.name="jane";	
		System.out.println( fb2.name );
		System.out.println( fb1.name );
		fb1.name="john";	
		
	}

}
