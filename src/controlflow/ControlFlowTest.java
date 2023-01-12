package controlflow;

import java.util.Scanner;

public class ControlFlowTest {

	public static void main(String[] args) {

		// If - else ... either or
		//boolean condition
		//boolean variable OR operators that provide boolean result
		//	equality, relational, conditional 

		int a=10;
		int b=11;
		boolean c=false;
		if( a == b  || a < b) {// code executed upon condition being true
			System.out.println("hi");
		}
		else {// code executed upon above condition being false
			System.out.println("bye");
			System.out.println("bad");
		}
		// a == b  || a < b
		// 10==11  || 10<11
		// false   || true
		// true
		int balance=100;
		int withAmount=20;
		if( balance >= withAmount) {
			System.out.println("tran is successful");
			System.out.println("good");
		}// 
		//int x;
		else{
			System.out.println("tran failed");
			System.out.println("bad");
		}
		// rules
		// 1) if is mandatory.. else cannot exists without if
		// 2) else is optional
		// 3) in IF or ELSE if you have more than 1 line use the block
		// 4) dont interrupt if-else chain.. no code written in-between
		// 5) do not end if with a semicolon.. considered as empty block
		
		int d=10;
		int e=11;
		if(d==e); {
			System.out.println("d and e are same");
		}
		
		// if can be used as multiple choice
		// if condition doesnt match.. move on to the next condition
		// if a condition mathces... u exist multiple choice 
		System.out.println("begin");
		
		int f=7;
		// 59 to 66... sequence of multiple choice
		if(f==1)
			System.out.println("withdraw");
		else if(f==2)
			System.out.println("deposit");
		else if(f==3)
			System.out.println("balance inquiry");
		else  // default block.. if none of the above condi matched
			System.out.println("thanks for using our bank");
		
		
		System.out.println("end");
		
		/*
		Scanner sc=new Scanner(System.in);
		int bal=100;
		System.out.println(  "enter the amount to withdraw" );
		int amount=sc.nextInt();
		if( bal > amount) {
			System.out.println("please collect your cash");
		}
		else {
			System.out.println("insufficient fund");
		}
		*/
		for( int i=0 ;  i < 3 ; i++){
			System.out.println("hi");
			if(i==1)
				break;
			
			System.out.println("bye");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println(  "do you wish to add item to cart.. type true or false" );
		boolean choice=sc.nextBoolean();
		// 0 or more loop.. condition could fail the first time itself
		while(choice == true) {
			System.out.println("item added to cart");
			System.out.println(  "do you wish to add another item to cart.. type true or false" );
			choice=sc.nextBoolean();
		}	
		
		// 1 or more loop.. condition comes after first loop
		do{
			System.out.println("bank transaction completed");
			System.out.println(  "do you wish to do another bank transaction.. type true or false" );
			choice=sc.nextBoolean();
		}while(choice == true) ;
		
		// if comparing just a value against primitive or string data type
		// primitive and string data type 
		int s=2;
		switch(s) {
			case 1: // case values should match switch input data type
				System.out.println("print 1");
				break; // break mandatory for all cases
			case 2:
				System.out.println("print 2");
				break;
			case 3:
				System.out.println("print 3");
				break;
			case 4:
				System.out.println("print 4");
				break;
			default :
				System.out.println("unknown number");
				break;
					
		}
		
		
		
		
		
	}
}
