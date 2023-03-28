package methods;

import dominos.Address;

public class Student {

	public static void main(String[] args) {
		Math m=new Math();
		// give input 10,15
		int x=10;
		int y=5;
		String z="35";
		Address a=new Address();
		
		//int result=m.add(123,10);
		int result=m.add(x,y);
		//int result=m.add(10,5);
		
		// method call=using service
		//int result=m.add(x,y);
		// receive output
		System.out.println( result );
		
		m.changeAddress(x,a);
		// # of input
		// data type should match
		// order should match
	}

	
}
