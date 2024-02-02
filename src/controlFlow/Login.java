package controlFlow;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		 System.out.println( "Welcome to Java Bank" );
		 System.out.println("Enter your pin");
		 
		 Scanner sc=new Scanner(System.in);
		 int customerTypedPin=sc.nextInt();
		 
		 BankAccount ba=new BankAccount();
		 boolean status=ba.verifyPin(customerTypedPin);
		 if( status == true) {
			 System.out.println("how can i help ? ");
			 
			 while(true) {
				 // banking choice logic start
				 System.out.println("press 1 for withdraw, 2 for deposit , 3 for balance enquiry");
				 int choice=sc.nextInt();
				 if( choice == 1 ) {
					 System.out.println("Enter the amount to withdraw");
					 break; // break the loop
				 }
				 else if (choice ==2) {
					 System.out.println("Enter the amount to deposit");
					 break; // break the loop
				 }
				 else if (choice ==3 ) {
					 System.out.println("your balance is 100$");
					 break; // break the loop
				 }
				 else { // default 
					 System.out.println( "invalid choice ");
				 }
				 // banking choice logic ends
			 }
		 }
		 else {
			 System.out.println("invalid pin , please try again later");
		 }
	}

}
