package inheritanc;
// abstract - incomplete 100%
public abstract interface ICar {
	int a=10; // constant, unchangeable
	
	public void drive();
	public void turn();
	public default void reverse() {
		System.out.println("reverse car");
	}
	public default void play() {
		System.out.println("play car");
	}
	
}
