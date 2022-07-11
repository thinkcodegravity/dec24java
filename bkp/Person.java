
public class Person {
	
	// long term = Global variable
	// instance variable
	String name="john"; // specific to every instance/version of Person
	// static variable
	static String speices="human"; // shared information

	// accessible from anywhere. 
	//within and outside program
	
	// input = parametric variable
	// accessible anywhere within the currennt method
	public int add(int a, int b) 
	{
		int sum=a+b; // temp information = local variable
		{System.out.println( sum );
			int q=40;
			{
				int s=20;
				int r=50;
				// local variable are accessible
				// from line it was declared
				// till end of the block
				int p=20;
				{
					int x=40;
					System.out.println(sum);
				}
				System.out.println(sum);
			}
			System.out.println(sum);
		}
		return sum;
	}
	// { opening bracket
	// } closing bracket
	// input = parametric variable
	public int sub(int x, int y) {
		//System.out.println(a);
		System.out.println(name);
		int sub=x-y; // temp information = local variable
		return sub;
	}
}
