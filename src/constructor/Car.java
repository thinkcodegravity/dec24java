package constructor;

public class Car {
	int vin=123;
	String color="white";
	int door=4;
	
	// 1) there is no output/return type
	// 2) name should be exactly similar to class name
	public Car(String c) {
		color=c;
	}
	// more than 1 constructor
	public Car(int d) {
		door=d;
	}
	public Car(String c, int d) {
		color=c;
		door=d;
	}
}
