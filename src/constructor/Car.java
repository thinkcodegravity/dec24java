package constructor;

public class Car {
	String color="white";
	int vin=1234;
	int doors=3;
	
	
	// Rules on creating constructor
	/*
	 1) name is similar to class name
	 2) NO return type
	 3) can contain more than 1 constrcutor
	 4) compiler adds default constrcutor.
	 	ONLY IF no constructors is defined by 
	 	programmer
	 */
	
	public Car(int v) {
		vin=v;
	}
	public Car(int v,String c) {
		vin=v;
		color=c;
	}
	public Car(int v,String c,int d) {
		vin=v;
		color=c;
		doors=d;
	}
	
}
