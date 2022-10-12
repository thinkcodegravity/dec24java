package polymorphism;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for basic, 2 for economy car, 3 for super car");
		int option=sc.nextInt();
		if(option==1) {
			Car c=new Car();
			testDrive(c);
		}
		else if(option==2) {
			Nissan n=new Nissan ();
			testDrive(n);
		}
		else if(option==3) {
			Ferrari f=new Ferrari ();
			testDrive(f);
		}
	}

	public static void testDrive(Car c) {
		c.drive(); // runtime polymorphism
	}
}
