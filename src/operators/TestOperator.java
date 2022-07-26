package operators;

public class TestOperator {

	public static void main(String[] args) {
		
		int c=20 * 3;// c = 60 
		int d=10 + 20;// d = 30
		int e = c / d;// int e= 60 / 30; int e=2;
		
		System.out.println( c );
		System.out.println( d );
		System.out.println( e );
		
		int x=10;
		int y=10;
		String p=new String("john");
		String q=new String("john");
		String r="jane";
		String s="jane";
		
		// recommendataion to use on primitive only
		System.out.println(  x==y  );	// 10==10.. is 10 equal to 10	
		System.out.println(  x!=y  ); // 10!=10... is 10 NOT equal to 10	
		// equality operator operates differently
		// on object/reference data type.. unreliable
		System.out.println(  p==q  );		
		System.out.println(  r==s  );		
		
		int a=20;
		int b=30;
		System.out.println( a < b   );// is a LESS than b
		System.out.println( a > b   );// is a GREATER than b
		
		int f=25;
		int g=25;
		// Either f 25 LESS than or EQUAL to g 25
		System.out.println( f <= g   );
		// Either f 25 GREATER than or EQUAL to g 25
		System.out.println( f >= g   );// is f 25 GREATER than g 25
		
		
		int balance=100;
		int withdrawAmount=20;
		balance = balance - withdrawAmount;
		// balance = 100 - 20;
		// balance = 80;
		
		int stockIphone=3;
		int orderQuantity= 5;
		System.out.println( stockIphone > orderQuantity  );
		

		int h=10;
		h++; // h =11
		h++; // h = 12
		h--;// h= 11
		h--;// h=10
		h--;// h=9
		
		System.out.println(h);
		
		int i=10;
		System.out.println( i ) ; // prints 10
		// i = 9
		System.out.println( --i ); // prints 9
		System.out.println( i--) ; // prints 9
		// i = 8
		// i = 7
		System.out.println( --i ); // prints 7
		
		
		int j=10;
		System.out.println( j ); // print 10
		// j=11
		System.out.println( ++j ); // print 11
		// j=12
		System.out.println( ++j ); // print 12
		System.out.println( j++ ); // print 12
		// j =13
		
		int k=10;
		int l=20;
		boolean m=true;
		
		System.out.println( k>l || m   );
		//System.out.println( 10>20 || true   );
		//System.out.println( false || true   );
		
		
		//System.out.println( k+l || m   );
		// System.out.println( 10+20 || true   );
		// System.out.println( 30 || true   );
		
		// bitwise operator
		System.out.println( 5&10);
		System.out.println( 5|10);
		System.out.println( 8^10);
		System.out.println( ( 10+ 5 ) < 5*2 || (20 +4) + 4 * 3 < 21  );
	}

}
