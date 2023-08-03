package constructor;

public class Car {
	String color="white";
	int door=4;
	// polymoprhims - many forms, do same things in many ways
	// many ways to construct a car
	public Car(int d) {
		door=d;
	}
	public Car(String c) {
		color=c;
	}
// constructors dont have return type
// name of constructor matches class name
	public Car(int d,String c) {
		door=d;
		color=c;
	}
// because programmer provided constructor
// no default constructor will be provided
	
	{
		// method  call error
		//add(10);
	}
	
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	

}
