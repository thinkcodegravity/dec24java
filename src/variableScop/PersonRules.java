package variableScop;

public class PersonRules {
	// variable = store information
	/*
	 Long term information : ( global variable)
	 	specific to instance - "instance variable"
	 	share by all instance - "class/static variable"
	 short term information :
	 	information recieved from "outside source"/users - "parametric/input variables"
	 	temprory information = local variable
	 */
	/*
	 Rules
	 1) no conflict at global level
	 2) dupilcate/conflict allowd at global vs parameteric  or global vs local
	 	1 global and 1 paramter, 1 global 1 local
	 3) no conflict between parameteric v/s local... local vs local
	 4) global variable - can be accessed from
	  nywhere within or outside the program
	 5) parametric variable exist from first line of the
	 	method till the last
	 */
	
	// global variable = global scope
	String name="john"; 	// instance variable
	static String speices= "human";	// shared variable
	int age=20;
	int p=10;
	
	// paremetrice variable
	public int add(int a, int b) {
		int p=20;
		System.out.println( p ); // prints local variable
		System.out.println( this.p ); // prints global instance variable
		
		System.out.println( a );
		System.out.println( age );
		String name="jane";
		int sum=a+b;// local variable
		System.out.println(sum);
		System.out.println( a );
		return sum;
	}
	
	public int sub(int x, int y) {
		System.out.println( a );
		System.out.println(sum);
		System.out.println( age );
		int sub=x-y;// local variable
		return sub;
	}
	
	public void localScopeTest() {
		// nested block
		{ // local variable duplicate cant exist while another variable already exists
			int x=10;
			// from the line# variable was declared = 53
			// till the end of variables block = 63
				// look at the opening bracket before this variable, click on it
				// square hightlighted closing bracket tells the end of this variable block
			{ System.out.println( x );
				{ int x=20;
					System.out.println( x );
				}
			} System.out.println( x );
		}
		int x=30;
	}
	
	
	
	
	
}
