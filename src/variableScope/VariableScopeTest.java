package variableScope;

public class VariableScopeTest {

	 public static void main(String args[]) {
		 Person p=new Person();
		 System.out.println(  p.age );
		 System.out.println( p.planet );
		 System.out.println(  p.number1);
		 System.out.println(  p.digit1);
		 System.out.println( p.x );
		 
		 int x=20;
		 //String x="john";
		 // redeclaration not allowed
		 x=30;
		 // reassignment value is ok
	 }

}
