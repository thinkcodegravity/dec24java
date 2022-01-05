
public class Car {
	
  //public OUTPUT methodname(Input) 
	public int sub(int a, int b) {
		int sub=a-b;
		return sub;
	}
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	
	
	String status="idle";
	public void startCar() {
		startEngine("run"); // method call
	}
	public void pumpfuel() {
		System.out.println("inject fuel to engine");
	}
	public int startEngine(String s) {
		System.out.println("starting car now");
		pumpfuel();// method call
		System.out.println("motors running");
		rotateWheel( 10 );// method call
		return 1;
	}
	
	public void rotateWheel(int i) {
		System.out.println("Wheels rotation, car is moving");
		status="moving";
	}
}
