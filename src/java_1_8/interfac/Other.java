package java_1_8.interfac;

import java.nio.file.Files;

public class Other {
	public static void main(String [] args) {
		//wrapper class improvemet
		System.out.println(Integer.MAX_VALUE);
		System.out.println( Integer.sum(12,1));
		// lambda
		ICalculator ic = (x,y,z) -> 
			{ 
				int sum=x + y + z; 
				return sum;
			} ;	
		// rule
		/*
		 1) functional interface only
		 2) parameter section - (x,y,z)
		    define variable comma separated without data type
		 3) logic - follows after ->
		 	if logic contains more than 1 line
		 	write in curly bracket
		 */
		System.out.println( ic.add(1,2,3) );
		
		
	}
}
