package constructor;

public class Car {
	int vin=123;
	String color="white";
	int door=4;
	
	// constrcutor looks exactly similar to method
	// NO return type
	// name is similar to class name
// If anyone wants to construct a car
// provide int vin number to me
// constructor polymorphism	
	public Car(int v) {
		vin=v;
	}
// use this to communicate between
// other constrcutors in the same program
	public Car(int v,int d) {
		this(v);
		door=d;
	} 
	public Car(int v,int d,String c) {
		this(v,d);
		color=c;
	}
	public Car(String c,int v,int d) {
		this(v,d);
		color=c;
	}
	public Car() {
		
	}
	public int add(int a, int b) {
		return a+b;
	}
}
