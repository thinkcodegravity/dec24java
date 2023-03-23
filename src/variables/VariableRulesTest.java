package variables;

public class VariableRulesTest {
	public static void main(String args[]) {
		// COMMENTS = green colored lines... not part of our code
		// DATA TYPE = LHS ... highlighted in purple color Or appears as the first word
		// VARIABLE = highlighted in blue without single or double quotes
		// VALUE looks like literal number 123,fraction number 123.1,
		
		// Variable naming rules
		// should start with alphabet or $ or _
		// can contain any alphabet or number or $ or _
		
		// rule 1) variable has to be declared before using in program
		// rule 2) values can appear only on RHS
		// rule 3) variable can appear on LHS or RHS
		// rule 4) If a variable appears on RHS, 
		//			program substitutes with its respective value
		
		int asd;
		int x=10;
		
		//20=x;
		x=20;
		int y=x;//int y=20   ; 
		
		// PROGRAM ALWAYS CONVERTS EVERYTHING ON THE RHS INTO A SINGLE VALUE
		int a=10;
		int b=20;
		int c=30;
		c=a;// c=10;
		b=40;// b=40;
		a=b;// a=40;
		b=c; // b=10;
		a=10+50-20;// a=40;
		
		// RHS if a variable- replace with its MOST RECENT VALUE
		// If multiple value... resolve to single value
		int p=20;
		int q=11;
		int r=23;
		p=q;// p=11;
		r=20;// r=20;
		p=r;// p=20;
		p=20+5; // p=25
		q=p; // q=25
		r=p+q;// r= 25+q ..... r = 25 + 25... r=50
		
		System.out.println(  p ); // print 25
		System.out.println(  q ); // print 25
		System.out.println(  r ); // print 50
		
		
		
		
		
		
	}
	
	
	public void haveBreakfast() {
		
	}
	
}
