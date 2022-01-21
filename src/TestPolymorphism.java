import java.util.Scanner;

public class TestPolymorphism {

	public static void main(String[] args) {
		//Car c=null;
		//c.drive();
		Nissan ni=new Nissan();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for basic, 2 for ecomony, 3 for lucury , 4 for super cars, 5 for flying cars");
		int option=sc.nextInt();
		if(option ==1) {
			Car c=new Car();
			testDrive(c);
		}
		else if(option ==2) {
			Nissan n=new Nissan();
			testDrive(n);
		}
		else if(option ==3) {
			Mercedes m=new Mercedes ();
			testDrive(m);
		}
		else if(option ==4) {
			Ferrari f=new Ferrari();
			testDrive(f);
		}
		else if(option ==5) {
			FlyingCar fc=new FlyingCar();
			testDrive(fc);
		}
		
	}
	public static void testDrive(Car c) {
		// runtime polymorphism
		// drive method of actual variable passed 
		// will be called
		c.drive();
	}
}
