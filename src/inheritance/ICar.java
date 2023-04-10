package inheritance;

// abstract 100%= incomplete program
public interface ICar {
	// final , cannot reassignment/change
	int x=10;
	
// outline, to-do list, checklist
// agreement, specification
	public void start();
	public void drive();
	public void takeTurn();
	public void stop();
	default void airCooler() {
		System.out.println("cool air");
	}
	
}
