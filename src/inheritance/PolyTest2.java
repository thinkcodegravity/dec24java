package inheritance;

import java.util.Scanner;

public class PolyTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for basic, 2 economy, 3 luxury, 4 super");
		int choice=sc.nextInt();
		if(choice ==1) {
			Cars ca=new Cars();
			//method input can be same as method declartion
			testDrive(ca);
		}
		else if(choice ==2) {
			Toyota t=new Toyota();
			//method input can be child of method delcaration
			testDrive(t);
		}
		else if(choice ==3) {
			Nissan n=new Nissan();
			//method input can be child of method delcaration
			testDrive(n);
		}
		else if(choice ==4) {
			Ferrari f=new Ferrari();
			//method input can be child of method delcaration
			testDrive(f);
		}
	}
// Cars c=new Nissan();
// runtime poymmorphism
	public static void testDrive(Cars c) {
		c.drive();
	}

}
