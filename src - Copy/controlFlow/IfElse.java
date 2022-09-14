package controlFlow;

public class IfElse {

	public static void main(String[] args) {
		
		int p=20;
		int q=20;
		// ; after if is empty bracket
		if(p>q); {
			System.out.println("p is greater than q");
		}	
		
		int x=20;
		int y=20;
		// if will process its block if condition is true
		// either or
		if(  x>y ) {
			System.out.println("x is greater than y");
		}
		else if(  x==y ) {
			System.out.println("x is equal to y");
		}
		else { // default block
			System.out.println("x is lesser than y");
		}
		
		System.out.println("bye bye");
	}

}
