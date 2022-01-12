package jtrainingdec;

import java.util.Scanner;

public class ControlFlow {
	
	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your userid ");
		String userid=sc.next();
		System.out.println("please enter your password");
		String password=sc.next();
		int registeredPin=1234;
		String registeredUserd="john";
		String registeredPwd="john1!";
		if( userid.equals(registeredUserd) && password.equals(registeredPwd))
		{
			System.out.println("welcoem to java wbsite");
		}
		else {
			System.out.println("failed login");
		}
		
		/*
		if( pin == registeredPin  )
		{
			System.out.println("welcome to java bank");
		}
		else {
			System.out.println("invalid pin");
		}
		
		
		 
		System.out.println("enter 1 for withdraw, 2 for deposit, 3 for exit");
		int choice=sc.nextInt();
		int balance=100;
		if(choice==1) {
			System.out.println("how much would you like to withdraw");
			int withdrawAmount=sc.nextInt();
			if(balance >= withdrawAmount) {
				balance=balance-withdrawAmount;
				System.out.println("your new account balance is:"+balance);
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		else if(choice==2) {
			System.out.println("how much would you like to deposit");
		}
		else if(choice==3) { 
			System.out.println("thank you for using java bank");
		}
		
		System.out.println("bye bye");
		*/
		for(int i=0; i < 5; i++){
			System.out.println("for loop:");
		}
		for(int i=0;i<3; i++)
		{
			System.out.println("hi");
			if(i==1){
				break;
			}
			System.out.println("bye");
		}
		
		System.out.println("program ends");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("add to cart, press 1 for yes and 2 for no");
		int choice=sc.nextInt();
		while ( choice==1 ) {
			System.out.println("item added in the cart");
			System.out.println("add another item to cart, press 1 for yes and 2 for no");
			choice=sc.nextInt();
		}
		
		do {
			System.out.println("atm transaction processed");
			System.out.println("press 1 for another transaction and 2 to exit");
			choice=sc.nextInt();
		}while(choice == 1);
		
		int option=5;
		switch(option) {
			case 1:
				System.out.println("chose 1");
				break;
			case 2:
				System.out.println("chose 2");
				break;
			case 3:
				System.out.println("chose 3");
				break;
			default:
				System.out.println("unknown option");
				break;
		}
		// switch case can be used primitive or string
		// if switch is handling int... cases should be int
		// every case should end with a break
		
	}

}
