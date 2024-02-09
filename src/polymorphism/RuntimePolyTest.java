package polymorphism;

import java.util.Scanner;

public class RuntimePolyTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for basic, 2 for Nissan, 3 for Toyota, 4 for ferrari super car test drive, 5 for flying car");
		int choice=sc.nextInt();
		//int x=10/0;
		if(choice==1) {
			Car c1=new Car();
			testDrive(c1);
		}else if(choice ==2) {
			Nissan n=new Nissan();
			testDrive(n);
		}else if(choice ==3) {
			Toyota t=new Toyota();
			testDrive(t);
		}else if(choice ==4) {
			Ferrari f=new Ferrari();
			testDrive(f);
		}else if(choice ==5) {
			FlyingCar fc=new FlyingCar();
			testDrive(fc);
		} 
		
	}
// FUTURE PROOF
	public static void testDrive(Car c) {
		c.drive();
	}
}
