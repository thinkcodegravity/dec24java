package variableScop;

public class Person {
	// Global variable
		// long term information
		static String planet = "earth"; // shared/class/static variable
		String name = "john"; // specific/instance variable
		int age = 20; // specific/instance variable
		//static String age = 21;
		static String speices = "human being"; // shared
		
		String fingerprint="qwe";
		static String breathe="oxygen";
		
	// Rules
	// names conflict
	// global and global cannot conflict
	// local and local cannot conflict in the same block
	// global and local can conflict
			
	// local variable
	// short term information
	// paramteres/ input variable : variable in the method
	// declaration = no values should be provided here
	// time = scope/lifespan of entire method body
	public void breakFast(int time) {
		System.out.println(time);
		String food = "toast";
		System.out.println(planet);
		System.out.println(name);
		System.out.println(age);
		System.out.println(speices);
		System.out.println(food);
		System.out.println(time);
	}

	public void test() {

		{
			//local and local cannot conflict in the same block
			int x = 10;
			System.out.println(x);
		}
		System.out.println(x);
		{
			//local and local cannot conflict in the same block
			int x=20;
			System.out.println(x);
		}
		System.out.println(x);

	}

	public void test2() {

		{
			System.out.println(x);
			{
				int x = 10;
				x=10;
				{
					System.out.println(x);
				}System.out.println(x);
			}
		}
		System.out.println(x);
	}
	// scope
	/*
	 	start : line it was declared  : 66
	 	end : find out closing bracket of x block
	 		find out the closest opening bracket above : 64
	 		click on it
	 		look for square on closing bracket : 78
	 */
	
	public void test3() {
		System.out.println(y);
		int y=20;
		{
			int y=30;
			System.out.println(y);
			{
				System.out.println(y);
			}
		}
		{
			System.out.println(y);
		}
		System.out.println(y);
	}
	
	
	public void run() {
		System.out.println(planet);
		System.out.println(name);
		System.out.println(age);
		System.out.println(speices);
		System.out.println(time);
		System.out.println(food);
		
	}

	 void abc() {
		
	}
	// global
	int abc=20;
	
	public void test4() {
		// global and local CAN conflict
		// local
		int abc=30;
		// 30 .. local get first preference
		System.out.println( abc ); 
		// 20 .. if need exclusive access to global 
		System.out.println( this.abc );
	}
	
	
}
