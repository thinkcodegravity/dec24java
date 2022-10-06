package controlflow;

import java.util.Scanner;

public class Question3 {
	/*
	 * Write a program that has-a registered phone, userid, password
	   Create a method to retrieve userid. That will take input as phone and if phone matches registered phone return userid.
	   Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.
	 */
	
	long phoneRegister = 1231231231;
	String userId = "John321";
	String password;
	
	public String idRegistration(long phoneInput) {
		if(phoneInput == phoneRegister) {
			System.out.println(userId);
			return userId;
		}else {
			return "invalid phone";
		}
		
		
	}
 
	
	public String pwdRegistration(String loginUserId) {
		if(loginUserId.equals(userId)) {
			System.out.println(password);
			return password;
		}else {
			System.out.println("Not able to retrive password");
			return "invalid userid";
		}
		
		
	}
	public static void main(String argsp[]) {
		menuItems();
	}
	public static void menuItems() {
		System.out.println("enter 1. for Pizza");
		System.out.println("enter 2. for Pasta");
		
		int option = 0;
		Scanner sc = new Scanner(System.in);
		try{
			sc.reset();
			option=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("please enter numbers only");
			System.exit(-1);
		}
		
		switch(option) {
		case 1: 
			System.out.println("The price of pizza is: $15");
			break;
		case 2:
			System.out.println("The price for Pasta is: $10");
			break;
		default :
			System.out.println("Salad for $5");
		}
	}

	
}
