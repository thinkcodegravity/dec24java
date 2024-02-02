package operator;

public class OperatorTest {
// CURLY BRACKET blocks = { } : defines boundary for class/program,
// method, logic
	public static void main(String[] args) {
		 // statement = ; SEMICOLON
		// variable declara/initalizatino , method CALL
		int x;
		x=20;
		x=30;
		add(5,6);
		// = ASSIGNMENT operator
		/*
		 LHS = RHS
		 1) RHS value should match LHS data type
			int age=10; // YES
			int age="john"; // NO
		2) LHS can always be variables (NO VALUES)
			10=int age; // NO
			int x=20; // YES
		3) RHS can have one of these
			3a can have matching value
			3b can have matching data type variable ( substitue with its value)
			3c can have expression ( solve expression on the right )
		
		*/
		// ARITHEMETIC OPERATOR
		// Operates on numeric data type
		// output is numeric data type
		int d=10+20;
		//int e=10+"john"; 
		int e=30-20;
		int f=30*20;
		int g=20/5; // 0
		int h=21%5; // modulos operator - Remainder
		
		// EQUALITY OPERATOR  == !=
		// operate on ALL data type
		// output is boolean
		boolean output=  (10==10);
		System.out.println(  output );
		
		// RELATIONAL OPERATOR <  > <= >=
		// less than or greater than
		// operates on numeric data type
		// output is boolean
		// 10 > 4 : 10 is greater than 4
		// 10 < 7 : 10 is less than 7
		
		System.out.println("relational");
		boolean as=  10 <= 10 ; // 10 is either less or equal to 10
		System.out.println( as );
		
		// UNARY operator
		// operates on numeric data type
		// output is numeric data type
		// + -
		// -(-5) = +5
		
		System.out.println(  -(+(-5))	);
		// increment ++ ... decrement --
		// increment = increase value by 1
		// decrement = decrease value by 1
		int i=10;
		i++;
		i++;
		i--;
		//System.out.println( i );
		// post = increase/decrease on next line 
		// pre  = increase/decrease on previous line
		
		int j=10;
		
		// j=11
		System.out.println( ++j ); // prints 11
		
		
		System.out.println( j++ ); // prints 11
		// j=12
		
		System.out.println( j-- ); // prints 12
		// j=11
		// j=10
		System.out.println( --j ); // prints 10
		
		// CONDITIONAL operator && and   || or
		// operates on boolean
		// output is boolean
		// practical usage = combination with other operators
		//					such as equality and relational
		// 10 > 5 && 10 == 20
		// true   && 10 == 20
		// true   && false
		//      false
		
		String regUserid="john";
		String regPwd="john1!";
		
		String loginUserid="john";
		String loginPwd="john1!";
		System.out.println( "login attempt is ");
		System.out.println(  regUserid==loginUserid     &&   regPwd==loginPwd );
		
		System.out.println( 20 & 10 );
		System.out.println( 20 | 10 );
		System.out.println( 20 ^ 10 );
		System.out.println(10 * 3 -1 + 3 + 20 * ( 5 - 2) > 20 + 1 * 2 + 3  || 2 < 15);
	}

	
	
	
	
	public static int add(int a,int b) {
		return a+b;
	}
}
