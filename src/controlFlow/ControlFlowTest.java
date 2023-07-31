package controlFlow;

import java.util.Scanner;

public class ControlFlowTest {

	public static void main(String[] args) {
		System.out.println("welcome to Java bank");
		int registeredPin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ATM pin");
		int enteredPin=sc.nextInt();
		//Either
		if ( registeredPin == enteredPin) 
		{
			System.out.println("welcome");
			System.out.println("Press 1 for withdraw, 2 for deposit, 3 balance inquiry");
			int choice=sc.nextInt();
			
			
			
		}
		// Or
		else
		{
			System.out.println("invalid pin. please try again later");
		}
		
		
		
	}

}
