package Inheritance;

// abstract = incomplete 
public interface ICar {
	// unchangeable, constant, fixed, final
	int x=20; // store info
	
	public abstract void drive();
	
	public void takeTurn();
	
	public default void reverese() {
		System.out.println("taking reverese");
	}
	
}
// abstraction = hide internal complexity

/*
 interface rules
 1) all methods are abstract/incomplete
 2) all variables are unchangeable
 3) cannot create instance
	ICar ic=new ICar(); NO
 4) initialize interface variable
 	with RHS as implementing class
	ICar ic=new Nissan(); YES

*/