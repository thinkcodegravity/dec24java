package polymorphism;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for basic, 2 for ford , 3 for ford mustang");
		int option=sc.nextInt();
		if(option==1) {
			Car c=new Car();
			testDrive(c);
		}
		else if(option==2) {
			Ford f=new Ford ();
			testDrive(f);
		}
		else if(option==3) {
			FordMustang fm=new FordMustang();
			testDrive(fm);
		}
		else if(option==4) {
			FordSuperFast fsf=new FordSuperFast();
			testDrive(fsf);
		}	
	}
	// Car > Ford > FordMustang
	public static void testDrive(Car c) {
		c.drive();// runtime poly
	}

}
