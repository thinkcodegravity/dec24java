package methods;

import restaurant.Addr;

public class Returns {
	/*
	 * Rules if the output is primitive/simple data type 
	 * 1) return value 
	 * 2) return variable
	 * 3) variable or value (datatype) should match output data type
	 */
	public int add(int number1, int number2) {
		// logic for addition
		return 10;
	}
	public int sub(int number1, int number2) {
		int a=20;
		String b="john";
		return a;
	}
	
	/*
	 * Rules if the output is object/complex data type 
	 * 1) return null
	 * 2) return output matching variable
	 */
	public Addr getRestaurant(int number1, int number2) {
		return null;
	}
	public Addr getGasStation(int number1, int number2) {
		int x=10;
		String y="street 2 new jersey 12345";
		Addr z=new Addr();
		return z;
	}

}
