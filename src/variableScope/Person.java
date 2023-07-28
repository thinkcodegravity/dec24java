package variableScope;

public class Person {
	// global variable - long term info
		// instance variable
		String name="john";
		// static/class variable
		static String speices="human";
		
		
	// RULES
	// Global variable cannot have duplicate names	
	// Local variable and input/parameter variable cannt have duplicate
	//       within the same method
	// local variable can have duplicate names..provided they both are outside
	// 	     each others scope/coverage
	// local variable should be intialized before using it
	//			local variable do not get default values
	// conflicts - global and local variable can have conflict names
	//		local gets the priority...
	//		if you need global/instance.. write "this." before the variable
	
		
		
		int age=20; // default value 0
				// above line is converted into "int age=0;"
	// local variable - short term info
		// input variable - values provided by other programs
	public int add(int number1, int number2) {
		int abc; // NO default value given
		String xy;
		
		// sysout = print values of variable
		System.out.println(xy);
		System.out.println( abc );
		
		int age=10;
		System.out.println( age );
		
		
		System.out.println(name);
		System.out.println(number1);
		//int number1=20;
		// local variable
		int x=10;
		int sum=number1+number2;
		return sum;
	}
	public int sub(int p, int q) {
		System.out.println(number1);
		System.out.println(name);
		int sub=p-q;
		return sub;
	}
// input variable scope/coverage begins from
// first line of method till the last
	public void test(int x) {
		{System.out.println(z);
			{
	// local variable - scope/coverage begins from line it was declared	
	// scope ends - when bracket it belongs to end
	//			look at the opening curly bracket above, find the closing
	//				bracket for the same.
				int z=10;
				{
					System.out.println(z);
				}
			}
		}System.out.println(z);
	}
	public void test2(int x) {
		{
			System.out.println(z);
			int z=10;
			{
				{
					System.out.println(z);
				}
			}
			System.out.println(z);
		}
		int z=10;
		System.out.println(z);
	}
}
