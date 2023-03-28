package reference;

public class TestSocialMedia {

	public static void main(String[] args) {
		// int boolean = primitive/simple
		int x=10;
		boolean y=true;
		// FacebookCustomer = object/complex
		FacebookCustomer cus1=new FacebookCustomer();
		FacebookCustomer cus2=new FacebookCustomer();
		
		cus1.name="john";	
		cus2.name="jane";	
		cus1.age=22;	
		cus2.age=25;	
		cus1=cus2;	
	
		System.out.println( cus1.name );	
		System.out.println(cus2.name);	

	}

}
