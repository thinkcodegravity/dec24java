package controlflow;

public class ControlFlowTest {

	public static void main(String[] args) {
		int regPin=1111;
		int pin=1110;
		boolean flag=true;
// if-else ... either or choice...
		// boolean is the input
			// use boolean variable or use an operator that has boolean output 
		if( regPin == pin  ) {
			System.out.println("welcome to java bank");
		}
		else {
			System.out.println("invalid pin , please try again later");
		}
	
		int balance=100;
		int withdraw=120;
		if(balance > withdraw) {
			System.out.println("please take money");
		}
		
		// int a=10; dont write any code between if and else
		
		else {
			System.out.println("insufficient balance");
		}
		// never break the chain
		
		// either or choices
		System.out.println("entering if else if");
			int choice=2;
			if( choice== 1) {//false
				System.out.println(" enter withdraw amount");
			}
			else if( choice== 2) {//true
				// if you enter one of the block .. you exit this sequence entirely
				System.out.println(" enter deposit amount");
			}
			else if( choice== 3) {
				System.out.println(" your balance is 100$");
			}
			else { // default block
				System.out.println("please enter any number between 1 and 3");
			}
		System.out.println("existing if else if");
		
		// ; in if is considered as empty block
		int x=10;
		if( x==12 ){
			System.out.println(" x is 12");
		}
		// if infinite loop defined : control exit condition from inside 
		// repeating code
		for( int i=1 ; i<=3 ; i++){
			System.out.println("hi");
			if(i==2)
				break;
			System.out.println("bye");
		}
		
	}

}
