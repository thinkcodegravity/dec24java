package inheritance;
// abstract = incomplete program

// abstraction - hiding internal complex code
// to-do list
// agreeement between programmer and customers
// 100% incomplete/abstract program
public interface ICar {
	int a=10;// unchangeable,constant,final
	public void drive(); // no logic involved
	public abstract void takeTurn();
	public void slowDown();
	default void reverse() {
		System.out.println("taking car reverse");
	}
}
