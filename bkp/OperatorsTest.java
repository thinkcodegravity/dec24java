
public class OperatorsTest {

	public static void main(String[] args) 
	{
		Car ca=new Car(); // RHS new
		int a=20; // RHS literal value
		int b=a; // RHS another variabel of same type
		int c=ca.add(30, 40); // RHS can be method call
		int x=10+20; // RHS can be expressions
		// assignment
		int y = 62 % 30;
		System.out.println( y );
		
		int p=20;
		int q=30;
		System.out.println( p != q );
		
		int warehouseStock=10;
		int order=20;
		System.out.println( warehouseStock >= order   );
		
		
		int s=-20;
		System.out.println(  -(-s)   );
		
		int t=10;
		// post... inc/dec after this line... use as is... inc later
		// pre... inc.dec before this line... inc first.. then use it
		System.out.println( t-- ); // print 10, t=9
		System.out.println( t++ ); // print 9, t=10
		System.out.println( ++t ); // t=11 , print 11
		System.out.println( --t ); // t=10, print 10
		
		String loginUserid="john";
		String loginPassword="john1!";
		String registerUserid="john";
		String registerPwd="john1!";
		
		System.out.println(
		loginUserid == registerUserid && loginPassword == registerPwd
				);
		

		int d=30;
		int e=40;
		System.out.println(  d>e || d<e         );
		
		System.out.println(  14^11 );
		
		System.out.println(  ( 2 * 3 + 4) + ( 3 - 1 + 2 / 2) - ( (3+4) * 10) );
		
		
		
		
		
	}
	/*
	LHS RHS same data type
	LHS ..... should always be variable
	RHS .... literal value, new, variable, method call , expression
	RHS if u have variable.... VALUE of RHS variable is assigned / overwritten on LHS variable
	*/
}
