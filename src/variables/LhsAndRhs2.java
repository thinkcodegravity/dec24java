package variables;

public class LhsAndRhs2 {

	public static void main(String[] args) {
		int a=10;
		// sysout - print VALUES on screen
		System.out.println( a ); // a is variable, so sysout will change a into its value
		System.out.println( "a" ); // "a" value
		
		int b=20;
		b=30;
		
		int c=40;
		//c="b"; // blue color mean value.. RHS value match LHS data type
		c=b; //  c=30
		//  c latest known value is 30
		b=10;
		// b latest known value is 10
		int d=b;
		// int d=10;
		// d latest known value is 10
		int e=10+20;
		// solve the expression on the right
		// int e=30;
		
		System.out.println(  b );
		System.out.println(  c );
		System.out.println(  d );
		System.out.println(  e );// prints e, 10,20 , other ????
		
		// FIRST declaration, initialization or reasignment
		//x=10; cannot store information in x, before declaration
		//int x;
		
		int y;
		y=10;
		String expDate="12/2024";
		
	}

}
