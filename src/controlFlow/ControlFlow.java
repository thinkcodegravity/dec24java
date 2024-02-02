package controlFlow;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		 int x=5;
		 int y=6;
		 // if else should be consecutive block of code
		 if( x==y )  // do not end if or else with a semicolon;
		 {
			 System.out.println("equal");
		 }
		  
		 // Loops
		 // airline booking in loop seat by seat = fixed loop
		 //		for loop
		 // shopping add to cart = 0 or N loop
		 //		while loop
		 // atm transaction = 1 or N loop
		 //		do-while loop
		 
		 // for( init : cond check ; modification)
		 //		execution
		 // I C E
		 // M C E
		 // M C E
		 
		 for(int i=1; i<5 ; i++)// no semicolons in for loop
		 {
			 System.out.println("looping");
		 }
		 
		 for(int i=1; i<5 ; i++) {
			 System.out.println("hi");
		 }
		 
		 // I C E : i=1 , true , print hi
		 // M C E : i=2 , true , print hi
		 // M C E : i=3 , true , print hi
		 // M C E : i=4 , true , print hi
		 // M C E : i=5 , false
		 // M C E
			
		 
		 for(int i=1; i>5 ; i++) {
			 System.out.println("hello");
		 }
		 
		 // I C E : i=1 , false
		 // M C E : 
		 // M C E : 
		 
		 for(int i=0; i<11 ; i=i+2) {
			 System.out.println(i);
		 }
		 
		 // I C E : i=1 , false
		 // M C E : 
		 // M C E : 
		/* 
		 for(int i=1; i<5 ; i--) {
			 System.out.println("hello");
		 }
		 */
		 // I C E : i=1 , true, print hi
		 // M C E : i=0 , true , pritn hi
		 // M C E : i=-1 , true, print hi
		 // i is always a negative numbr.. and cannot be greater than 5
		 // so loop never exist. infinitely stuck here
		 
		 // continue and break;
		 // continue : go to next loop
		 // break : exit loop
		 for(int i=1; i<5 ; i++) {
			 System.out.println("hello");
			 if(i==1)
				 continue;
			 if(i==3)
				 break;
			 System.out.println("bye");
		 }	
		 
		 System.out.println("program ends");
		 // I C E : i=1 true print hello
		 // M C E : i=2 true print hello prints bye
		 // M C E : i=3 true print hello
		 // M C E : 
		 
		 //program ends
		 Scanner sc=new Scanner(System.in);
		 // while and do while = explicitly include break statement
		 System.out.println("add to cart ? ");
		 boolean doadd2Cart=sc.nextBoolean();
		 // 0 or more loop
		 while(doadd2Cart) {
			 System.out.println("Item added to cart");
			 System.out.println("add another item to cart? ");
			 doadd2Cart=sc.nextBoolean();
		 }
		 // 1 or more loop
		 boolean atmNextTransaction;
		 do{
			 System.out.println("transaction complete");
			 System.out.println("do you want another transaction ? ");
			 atmNextTransaction=sc.nextBoolean();
		 }
		 while(atmNextTransaction);
		 
		 // switch case = multiple choice
		 
		 int p=3;
		 switch(p)
		 {
			 case 1: System.out.println("its 1");
				break;
			 case 2: System.out.println("its 2");
			 	break;
			 case 3: System.out.println("its 3");
			 	break;
			 case 4: System.out.println("its 4");
			 	break;
			 default : System.out.println("unknown");
			 	break;
		 }
		 
	}

}
