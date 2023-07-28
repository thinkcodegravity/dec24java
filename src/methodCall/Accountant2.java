package methodCall;

public class Accountant2 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int x=25;
		int y=20;
		String z="jane";
		
		//int result=c.add( 4,5,"john");
		// PASS BY VALUE
		int result=c.add( x,10,z);
		//int result=c.add( 25,10,"jane");
		System.out.println(result);
	}

}
