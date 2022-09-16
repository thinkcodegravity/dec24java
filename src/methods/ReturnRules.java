package methods;

public class ReturnRules {
	
	// primitive data type output
	public 	int		add   (int number1,int number2	) {
		
		// ACTUAL CODE/LOGIC WILL BE WRITTEN WITH HELP OF 
		//	OPERATORS AND CONTROL FLOW
		
		// return any value that matches output data type
			// return "john"; String value doesnt match output data type int
			// return 120;
		// return any variable but variable data type should matches output data type
		boolean x=true;
		String y="12";
		int z=100;
		//return y;  y vriable data type is STRING.. output data type is INT
		return z;
	}
	
	public void charity(int donation) {
		// if output is void... no need for return statement or we can give return
		//	with nothing
		return ;
	}
	
	public 	int		areaOfRectangle( int length   , int breadth  ) {
		return 2;
	}
	
	public	boolean	login( String email , String password  ) {
		return true;
	}
	
	// COMPLEX OUTPUT rules
	public	RestauAddress	locateRestaurant( String restaurantName) {
		// return null
		// return any variable but variable data type should matches output data type
		int a=10;
		String b="john";
		boolean c=true;
		RestauAddress d=new RestauAddress();
		return d;
		// return null;
	}
	
}
