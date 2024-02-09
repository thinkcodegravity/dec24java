package constructor;

public class Car {
	String brand="bmw";
	String color="white";
	int door=4;
	
	// polymorphism = overloading
	// overloading polymorphism on constructor
	public Car(String b){
		brand=b;
	}

	public Car(String b,String c) {
		brand=b;
		color=c;
	}

	public Car(String b,String c,int d) {
		brand=b;
		color=c;
		door=d;
	}
	public void drive() {
		
	}
}
