package controlflow;

import java.util.Scanner;

public class ControlFlowTest {
	public static void main(String args[]) {
		// swtich case 
		// rules
		// works with primitive(int, float, char, boolean) and String
		// switch input data type should match case options.
		// every case should end with a break;
		int id=3;
		switch (id) {
			case 1:
				System.out.println("welcome tom");
				break;
			case 2:
				System.out.println("welcome john");
				break;
			case 3:
				System.out.println("welcome jane");
				break;
			case 4:
				System.out.println("welcome mike");
				break;
			case 5:
				System.out.println("welcome andy");
				break;
			default:
				System.out.println("invalid user");
				break;
		}
		

		for (int i = 1; i < 5; i++) {
			System.out.println("hi");
			if (i == 3)
				break;
			System.out.println("bye");
		}

		System.out.println("Do you want to add to cart ? type true or false");
		Scanner sc = new Scanner(System.in);
		boolean choice = sc.nextBoolean();
		// 0 or MORE loop :
		// since condition is checked in the begining of first loop
		while (choice) {
			System.out.println("ADDING TO CART");
			System.out.println("Do you want to add to cart ? type true or false");
			choice = sc.nextBoolean();
		}
		// 1 or MORE loop
		// since condition is checked in the end of first loop
		do {
			System.out.println("BANKING transaction");
			System.out.println("Do you have any more transaction? type true or false");
			choice = sc.nextBoolean();
		} while (choice);

	}

	public static void main2(String[] args) {

		if (4 == 5)
			;
		{
			// empty block
		}

		{
			System.out.println("4 is equal to 5");
		}

		int registeredPin = 1234;
		System.out.println("enter the atm pin");
		Scanner sc = new Scanner(System.in);
		int enteredPin = sc.nextInt();
		// ********* EITHER_OR CONDITION FLOW :: IF-ELSE ****************
		// input boolean variable
		// or any operator thats provides boolean output
		// equality , relational, conditional
		// EITHER go to shopping OR watch movie
		// EITHER go to shopping .. hi how are you, had your dinner ? OR watch movie
		// OR watch movie
		// rules
		// curly brackets are not mandatory.. if single line of code in the if/else part
		// curly brackets should be used if multi line of code in the if/else part
		// else is optional.. but u cannot have an else without an if
		// if-else chain should be contagious block of code... no code should be written
		// in between
		// do not end if condition with semi colon
		if (registeredPin == enteredPin) {
			// if above condition true. enter the if block
			System.out.println("Welcome to java bank");
			// ********* MULTI CHOICE CONDITION FLOW:: IF-ELSE IF-ELSE IF-ELSE*********
			System.out.println("Press 1 to withdraw, 2 to deposit, 3 to exit");
			int enteredChoice = sc.nextInt();
			System.out.println("hi");
			if (enteredChoice == 1) {
				System.out.println("enter the amount to withdraw");
			} else if (enteredChoice == 2) {
				System.out.println("enter the amount to deposit");
			}

			else if (enteredChoice == 3) {
				System.out.println("Thank you for using java bank");
			}
			// default block
			else {
				System.out.println("invalid input : please enter 1,2,3 options");
			}
			System.out.println("bye bye");
		} else
			System.out.println("Error : invalid pin entered");

	}
}
