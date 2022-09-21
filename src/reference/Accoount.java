package reference;

public class Accoount {
	public static void main(String args[]) {
		Calculator c=new Calculator();
		int x=20;
		int y=30;
		x=c.add(x,y); // method call
		//x=whatever add method returned back
		//x=50;
		
		// x=c.add(20,30);
		// this line is "giving" input 20 and 30
		// to add method
		
		// consume service
		// passing input(x,y)
		// give input
		// take output
		System.out.println( x );
		System.out.println( y );
	}
}
