
public class Website {
	// has-a
	String websiteName = "www.googl.com";

	// does-a
	// method declaration
	public boolean login(String userid, String password) {
		// method definition / method body / method logic
		if(userid=="john" && password=="java")
			return true; // return statement
		else
			return false;
	}

	public float shoppingCart(float price, byte quantity) {
		return 2.5f; // return literal value that matches output data type
	}
	
	
	public float areaOfSquare(float side) {
		float b=20.5f;
		boolean c=true;
		return b; // return a variable that matches output data type
	}
	public String testing() {
		int a=10;
		float b=20.5f;
		boolean c=true;
		String d="john";
		return d;
	}
	public void test2() {
		
	}
	public Address searchRestaurant(String restName) {
		Address a=new Address();
		String x="street 1,newyork, ny, 123";
		return a;
	}
}
