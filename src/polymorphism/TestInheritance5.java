package polymorphism;

public class TestInheritance5 {

	public static void main(String[] args) {
		// only access methods avaialble in Car program
		Car c=new Nissan();
		c.drive(); 
		// typecasting to unblock the hidden
		// method from nissan
		c.takeTurn();
		((Nissan)c).takeTurn();

	}

}
