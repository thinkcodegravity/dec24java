package inheritance;
// incomplete program
// partial incomplete/abstract program
public abstract class Car implements ICar, IMusic{
	public  void drive() {
		System.out.println( a );
		System.out.println("driving the car");
	}
	public void playMusic() {
		System.out.println(" playing music");
	}
	public void slowDown() {
		System.out.println("sloing car and music");
	}
	public void reverse() {
		System.out.println("reverse my way");
	}
}
