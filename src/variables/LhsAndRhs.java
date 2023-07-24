package variables;

public class LhsAndRhs {

	// blue color letters are values
	// black color letters are variable
	public static void main(String[] args) {
		String x="john"; 
		// RULES
		//1) RHS value should match LHS data type
		int a=10;	// YES
		// int b="john"; // NO
		//2) LHS can always be variables (NO VALUES)
		int c=10; // YES
		//20=int d; // NO
		// 3) RHS can have one of these
		
		// RHS can have matching value
		int e=30;
				
		// RHS can have matching variable
		int f=e; // YES RHS is variable e , which is delcared as int
		// int g=x; // NO RHS is variable x , which is delcared as String
		// IF RHS has variable , programs substitue its last known value in its place
		// int f=30;
		
		
		// RHS can have expression
		
		
	}

}
