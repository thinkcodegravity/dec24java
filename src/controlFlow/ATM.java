package controlFlow;

import java.util.Scanner;

public class ATM {
	static int registeredPin=2222;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Java bank");
		System.out.println("Please enter 4 digit pin");
		int enteredPin=sc.nextInt();
		if( registeredPin == enteredPin )
			System.out.println("welcome.. What would you like to do today");
		else
			System.out.println("invalid pin, please try again later");
	}
}
