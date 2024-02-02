package controlFlow;

public class BankAccount {
	String registeredUserName="john";
	String registeredPassword="john1!";
	int registeredPin=1234;
	
	public boolean verifyPin(int customerEnteredPin) {
		if( customerEnteredPin ==  registeredPin  ) {
			return true;
		}
		else {
			return false;
		}
	}
	public void controlFlowNotes() {
		// if - else - boolean condition
		// can use boolean variable, boolean value, operator 
		//				that has boolean output
		// if = executes when condition is true and else executes
		// when condition is false
		/*
		  	either/if customer pin matches registered pin
		  		print welcome
		  	otherwise/else 
		  		print invalid pin
		 */
		int x=3; int y=4; boolean z=true;
		if( x > y ) {
		}
		if( x != y ) {// operator with boolean output
		}
		if( true ) {//boolean value
		}
		if( z ) { // boolean variable
		}
		// single choice = If
		// 2 choice either or = If Else
		// multiple choicec = If Else if else if 
		// else default block
		// pick 1 choice
		
	}
	
}
