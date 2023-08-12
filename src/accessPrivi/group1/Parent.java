package accessPrivi.group1; // is-A Parent
public class Parent {
	public int a; // by EVERYONE
		   int b; // programs in SAME package (package level access)
	protected 	int c; // programs in SAME package OR is-a program in other package
	private		int d; // NO ONE outside this program
	
	int add(int a, int b) {
		return a+b;
	}
	
	public Parent() {
		
	}
	
}
