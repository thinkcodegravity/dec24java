package variableScop;

public class LocalVariables {

	// input variable scope : from begining of method's curly bracket till end
	public void test(int a) {
		System.out.println(a);
		// RULES : no conflict in input and local variable names
		// int a=30;
		{
			System.out.println(x);
			{
				// RULES : no duplicates within the same scope
				int x = 10; // scope of local variable
				// exists FROM line it was declared.
				// TILL end of its block(curly bracket)
				// nearest opening curly bracket above ? 12
				// click on it.. and look for corresponding closing bracket ? 21
				{
					int x=23;
					System.out.println(x);
				}
				System.out.println(x);
			}
			System.out.println(x);
		}
		int x=20;
		System.out.println(x);
		System.out.println(a);
	}

	public void test2(int a) {
		{ System.out.println(x);
			int x = 10; // FROM : 31 TILL : 36
			{System.out.println(x);
				{System.out.println(x);
				}System.out.println(x);
			}
		}System.out.println(x);
		System.out.println(x);
	}
}
