package operator;

public class OpTest {

	public static void main(String[] args) {
		int x=10;
		x++;// x=11
		x--;// x=10
		x--;// x=9
		//System.out.println( x );
		// pre - post
		// pre = incr/decr before the line
		// post - incr/decr after the line
		
		int y=5;
		// y=4
		System.out.println(  --y ); // print 4

		System.out.println(  y-- ); // print 4
		// y=3
		// y=4
		System.out.println(  ++y ); // print 4
		// y=5
		System.out.println(  ++y ); // print 5

		System.out.println(  y-- ); // print 5
		// y=4
		
		String regUserid="john";
		String regPassword="john123";
		
		String loginUserid="john";
		String loginPassword="john123";
		
		// (regUserid == loginUserid) // true
		// (regPassword == loginPassword) // true
		// (regUserid == loginUserid)  && (regPassword == loginPassword)
		//          true				&&              true
		// 								true
		System.out.println(  (regUserid == loginUserid)  && (regPassword == loginPassword)                 );
		
		int a=10;
		int b=20;
		// (a>b)    || (b==a)
		// (10>20)  || (20==10)
		//  false   ||  false
		// 		   false
		System.out.println(   (a>b)    || (b==a)       );
		System.out.println( ( 4 + 5 ) < ( 2 - 1)  +  ( 4 / 2 ) - (3 * 4 ) || 4 < 2);
	}

}
