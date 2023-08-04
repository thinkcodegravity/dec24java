package inheritanc;

// interface = incomplete = abstract 
// interface = 100% incomplete/abstract
public interface ICar {
	
	int x=0; // CANNOT CHANGE VALUE (FINAL)
	
	public void drive();
	public void takeTurn();
	public void start();
	public void stop();
	default void reverse() {
		System.out.println(" taking reverse");
	}
// Abstraction - external view of product/hides internal complexity
// make checklist
// hides internal complexity - NO logic - method body
}
