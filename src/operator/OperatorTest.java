package operator;

public class OperatorTest {//class block or class body

	public static void main(String arg[]) {// method block or method body 
		int a; // declaration statement
		int b=10; // iniitialization statement
		b=20;// assignment statement
		int sum=add(10,20);//method invocation/call statement
		{// local block
			{
				
			}
		}
		//assignment operator = sign
		// LHS = RHS
		// LHS should always be variable
		// RHS will always convert/resolve to a single value
		// RHS can be value,variable,expression,method call
		// LHS and RHS values or data type should match
		int c=20;
		int d=c;// replace value of RHS variable... int d=20;
		int e=10+20;// replace the result of RHS operation.. int e=30;
		int f=add(10,5);// replace the result of method call on RHS... int f=15;
		//int g="john";
		
		//Arithmetic operator + - * / %
		// LHS + - * / % RHS (LHS and RHS should be of numeric data type)
		// Result is numeric data type
		String o="john";
		int p=20;
		int q=10;
		int r=p + q;// Result =  LHS + RHS ... 31
		r=p - q;// r=11
		r=p * q;// r=210
		r=p / q;// r=2
		r=p % q;// r=0
		
		
		//equality operators
		// check if LHS is same or equal to RHS
		// LHS == RHS (LHS and RHS data type should match)
		// Result is always boolean (yes/no) (true/false)
		String aa="john";
		String bb="john";
		int cc=10;
		int dd=11;
		boolean ee= (cc == dd);
		// boolean ee= (10 == 11);
		// boolean ee= false;
		System.out.println( ee ); // false
		System.out.println( aa==bb  ); // is aa and bb same /equal ... YES/TRUE
		System.out.println( cc==dd  ); // is cc and d same /equal ... NO/FALSE
		// check if LHS is different or not equal to RHS
		// LHS != RHS(LHS and RHS data type should match)
		// Result is always boolean (yes/no) (true/false)
		System.out.println( aa!=bb  ); // is aa and bb different /not equal ... NO/FALSE
		System.out.println( cc!=dd  ); // is cc and d different /not equal ... YES/TRUE
		
		String regUserid="asd";
		String refPwd="asd1!";
		
		String loginUserid="asdqq";
		String loginPwd="asd1!";
		
		System.out.println( regUserid == loginUserid );
		
		// relational operator
		// LHS < > RHS... LHS and RHS is always numeric data type
		// result is always boolean
		
		int ff=10;
		int gg=12;
		String hh="john";
		System.out.println(   ff < gg ); // is ff(10) less than gg(12) ... true
		System.out.println(   ff > gg ); // is ff(10) greater than gg(12) ... false
		
		int stock=10;
		int orderQuantity=11;
		System.out.println(  stock > orderQuantity  );// false.. order cannot be accepted
		
		int balance=100;
		int withdrawAmount=100;
		System.out.println(  withdrawAmount <= balance );// withAm should be less than or equal to balance
		
		
		// unary operator
		// + and - applies tonumeric data type
		// result is numeric
		int ii=-10;
		System.out.println( +ii  );//  +( -10 ) = -10
		System.out.println( -ii  );//  -( -10 ) = +10
		
		int jj=+11;
		System.out.println( +jj  );//  +( +11 ) = +11
		System.out.println( -jj  );//   -( +11 ) = -11
		
		// ! negation operator applies to boolean.. true
		// result is boolean
		boolean kk=false;
		System.out.println( !kk  );
		
		// incremenet and decremeent operator
		// applies on numeric data type
		// result is numeric data type
		int mm=10;// mm is 10
		mm++;// mm is 11
		mm--;// mm is 10
		mm--;// mm is 9
		System.out.println(mm);
		// pre and post
		// pre - increase or decrease on previous line
		// post - increase or decrease on next line
		
		int nn=20;
		
		System.out.println( nn++  );  // print 20
		// nn=21
		System.out.println( nn--  ); // print 21
		// nn=20
		System.out.println( nn++  ); // print 20
		// nn=21
		// nn=20
		System.out.println( --nn  ); // print 20
		// nn=19
		System.out.println( --nn  ); // print 19
		
		// conditional opeator && AND || OR
		// LHS and RHS should always be boolean 
		// LHS and RHS should be other operator that results as boolean
		// result is boolean
		int oo=10;
		int pp=11;
		boolean qq=true;
		boolean rr=false;
		
		System.out.println(  qq && rr   );// false
		System.out.println(  qq || rr   );// true

		// LHS and RHS should be other operator that results as boolean
		// LHS and RHS equality and relational operators results as boolean
		System.out.println(  (oo==pp ) && (oo<pp )   );// false
		//					 (10==11 ) && (10<11 )
		//					 (false  ) && (true)
		//							   false
		
		System.out.println(  (oo==pp ) || (oo<pp )   );// true
		//		 			 (10==11 ) || (10<11 )
		//					 (false  ) || (true)
		//							  true 

		


		String regUserid1="asd";
		String refPwd1="asd1!";
		
		String loginUserid1="asdqq";
		String loginPwd1="asd1!";
		
		System.out.println( (regUserid1 == loginUserid1) && (refPwd1==loginPwd1) );
		//				( 	(asd == asdqq) 				 && (asd1!==asd1!) );
		//				( 	(false) 				 	 && (true) );
		//												false
		
		
		System.out.println(  21 & 7 );
		System.out.println(  21 | 7 );
		System.out.println(  21 ^ 7 );
		
		System.out.println( (1+2) > (1-3) && (2+5+6) < 12 || 2<3);
		/*
		 	1) ()
			2) * / 
			3) + - 
			4) < >
			5) &&
			6) ||
			7) if operators at same level ... go left to right
			
			(1+2) > (1-3) && (2+5+6) < 12 || 2<3
			3 > (1-3) && (2+5+6) < 12 || 2<3
			3 > -2 && (2+5+6) < 12 || 2<3
			3 > -2 && 13 < 12 || 2<3
			true && 13 < 12 || 2<3
			true && false || 2<3
			true && false || true
			false || true
			true

		 */
	}
	
	public static int add(int a,int b) {
		return a+b;// return 10+5... return 15
	}
}
