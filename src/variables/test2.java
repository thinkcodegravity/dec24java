package variables;

public class test2 {

	public static void main(String[] args) {
		// LHS is ALWAYS variable
			int x=10;
			System.out.println(x); // print value of x
			String y="john";
		// RHS can be literal value/variable/operation/method
			int p=20; // 1) 20 is literal value
			System.out.println(p);//print value of p
			int q=x;  // matching data type variable
				// if variable on RHS... replace its value
				// int q=x; .... int q=10; 
			System.out.println(q);// print value of q
			int r=10;
			r=p;// r=p .... r=20
			System.out.println(r);
			int s=5+20+30;
				// if an operation on RHS
				// solve the operation to a single value
				// s=5+20+30... s=25+30.. s=55
			System.out.println( s );
			
			int a=10;
			int b=20;
			int c=30;
			int w= a + 10 + c;
			// java platform does below steps to solve RHS
			// int w= 10 + 10 + c;
			// int w= 10 + 10 + 30;
			// int w= 20 + 30;
			// int w= 50;
			System.out.println(  w  );
			
	}

}
