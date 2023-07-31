package controlFlow;

import java.util.Scanner;

public class ControlFlowTest2 {

	public static void main(String[] args) {

		/*
		 * Rules .. If Else : works on boolean equality,relational, conditional 1) Else
		 * is optional, if is mandatory 2) Else should follow if always 3) no code in
		 * between if else 4) do not end if or else with semicolon. semicolon is empty
		 * statment/block in control flow
		 * 
		 */
		int x = 30;
		int y = 20;
		if (x < y) {
			System.out.println("x is less than y");
		}

		System.out.println("Press 1 for withdraw, 2 for deposit, 3 balance inquiry");
		int choice = 5;
		if (choice == 1) {
			System.out.println("enter the amount to withdraw");
		} else if (choice == 2) {
			System.out.println("enter the amount to deposit");
		} else if (choice == 3) {
			System.out.println("your bank balance is 100$ ");
		}
		// default
		else {
			System.out.println("please enter a choice between 1 and 3");
		}

		for (int i = 1; i < 5; i++) {
			System.out.println("hi");
			if (i == 3)
				break;
			System.out.println("bye");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add item to the cart ?");
		boolean add2Cart = sc.nextBoolean();
		// 1 or more loop
		// condition check comes after the block
		// so first block pass is free
		do {
			System.out.println("item added to cart");
			System.out.println("Do you want another item to the cart ?");
			add2Cart = sc.nextBoolean();
		} while (add2Cart);

		// 0 or more loop
		// condition check comes before the block
		// so first pass itself might be skipped if add2Cart is false
		while (add2Cart) {
			System.out.println("item added to cart");
			System.out.println("Do you want another item to the cart ?");
			add2Cart = sc.nextBoolean();
		}

		// Switch case : multiple choice control flow
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("this is number 1");
			break;
 		case 2:
			System.out.println("this is number 2");
			break;
 		case 3:
			System.out.println("this is number 3");
			break;
 		default:
			System.out.println("unknown number ");
			break;
 		}

	}

}
