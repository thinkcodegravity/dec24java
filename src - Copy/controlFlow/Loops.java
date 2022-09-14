package controlFlow;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("welcome to loops");
		
		for(int i=1; i <= 3 ; i++ ){
			System.out.println( "hi");
			if(i==2)
				break;
			System.out.println( "bye");
		}
		
		
		int j=1;
		while(j < 3) {
			if(j==2)
				break;
			System.out.println("while");
			j++;
		}
		
		System.out.println("program loop completed");
		
		int x=3;
		do{
			System.out.println("hello there ");
			x--;
		}while(x>1); 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want to add item to cart ? type true or false");
		boolean choice=sc.nextBoolean();
		while(choice) {
			System.out.println("added item to cart");
			System.out.println("do you want to add another item to cart ? type true or false");
			choice=sc.nextBoolean();
		}
		
		// operate on primitive and string
		int atmChoice=5;
		switch (atmChoice) {
			case 1:// case values should match swith variable data type
				System.out.println("enter amount to withdraw");
				break;// break statement mandatory in each case
			case 2:
				System.out.println("enter amount to deposit");
				break;
			case 3:
				System.out.println("your balance is");
				break;
			default : // if not case matches... default category
				System.out.println("enter either 1 , 2 or 3");
				break;
		}
	}

}
