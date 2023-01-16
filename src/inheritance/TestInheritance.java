package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		AdvancedCar c=new GenZCar();
		c.drive();
		c.playMusic();
		c.takeTurn();
		// type casting
		((GenZCar)c).autoDrive();
	}

}
