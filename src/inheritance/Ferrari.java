package inheritance;

public class Ferrari extends Cars{
	// runtime polymorphism
	// OVERRIDING - reject parents solution
	// child has better solution than parent
	public void drive(  ) {
		System.out.println("driving fast car");
	}
}