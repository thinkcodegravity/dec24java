package inheritance;
// implement = writing the code
// for ALL missing/incomplete methods
// in ICar program
// abtract = incomplete program
public abstract class Nissan implements ICar{
	public void start() {
		System.out.println("starting car");
	}
	public void drive() {
		System.out.println("driving car");
	}
	public void takeTurn() {
		System.out.println("taking turn");
	}
	// missing stop method
}
