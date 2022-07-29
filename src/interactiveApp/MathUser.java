package interactiveApp;

import java.util.Scanner;
// FRONTEND program
//native application = JAVA
// web application = HTML
public class MathUser {
// caller program
	public static void main(String[] args) {
		Calculator c=new Calculator();
		// System in.. takes INPUT from screen
		Scanner sc=new Scanner(System.in );
		System.out.println("Please enter first number");
		//nextInt is method in scanner program
		// nextInt will capture integer input from screen
		// and it will return to the LHS variable
		int x=sc.nextInt();
		System.out.println("Please enter second number");
		int y=sc.nextInt();
		// int result=35
		int result=c.add(x,y);
		// System out.. print OUTPUT on screen
		System.out.println( "the addition result is:"+result);
		sc.close();
	}

}
