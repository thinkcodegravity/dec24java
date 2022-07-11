
public class VariableTest {

	public static void main(String[] args) {
		 long l=9999999999l; // literal value
		 float f=2.0f;
		 String degree="360";
		 
		 int a; // declaration
		 a=10; // initialization
		 a=20; // reassignment
		 
		 int b;
		 b=20;
		 
		 /*
		  	Value assigned to a variable for the FIRST time.
			RHS values should match the data type on LHS
			RHS can be literal value or variable of same type
		  */
		 String c="john";
		 /*
		  LHS SHOULD always be a vaariable
		  RHS can be literal values, variable, expression, method call
		  */
		 int p=30; // RHS literal value
		 int q=p; // RHS variable
		 // 30=p;
		 p=30;
		 System.out.println(  p );
		 System.out.println(  q );
		 
	}

}
