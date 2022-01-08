package jtrainingdec;

import java.util.Scanner;

public class ControlFlow {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* comments
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
		
		*/
		Address a=new Address ();
		System.out.println("please enter your city");
		a.city=sc.next();
		
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
	}

}
