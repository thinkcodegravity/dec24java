package constructor;

public class Car {
	int vin=123;
	String color="white";
	int door=4;
	
	/*
	 Constructor :
	 1) name should be same as class name
	 2) no return type/output
	 3) more than 1 constructor..(polymorphism)
	 many forms : many ways to create Car
	 */
	public int add(int a,int b) {
		return a+b;
	}
	public Car(String c) {
		color=c;
	}
	public Car(int d) {
		door = d;
	}
	public Car(String c,int d) {
		color=c;
		door=d;
	}
	
}
