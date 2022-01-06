
public class OperatorsTest {

	public static void main(String[] args) 
	{
		Car ca=new Car(); // RHS new
		int a=20; // RHS literal value
		int b=a; // RHS another variabel of same type
		int c=ca.add(30, 40); // RHS can be method call
		int x=10+20; // RHS can be expressions
		{
			{
				
			
			}
		}
	}
	/*
	LHS RHS same data type
	LHS ..... should always be variable
	RHS .... literal value, new, variable, method call , expression
	RHS if u have variable.... VALUE of RHS variable is assigned / overwritten on LHS variable
	*/
}
