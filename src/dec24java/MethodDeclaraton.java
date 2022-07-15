package dec24java;

public class MethodDeclaraton {

	// add method promised int output
	// RETURN int output
	public	int 	add( int number1 , int number2  ){
		// return statement
		// return a value that matches output data type
		// Rules on return statement
		/*
		 1) not required.. if output is void 
		 2) if it is simple/primitive 
		 	then return matching value or matching variable
		 3) if it is complex output
		 	then return null or matching variable;
		 4) if it is String output
		 	then return null or matching value or matching variable
		 */
		int x=20;
		return x; // matching variable... x is int.. output is int
		//return 2;// matching value .. 2 value is of int(output)
	}
	public String sayBye(   ) {
		// return null;
		//return "bye bye";
		String greeting="bye bye";
		return greeting;
	}
	public void hello(String friend) {
		
	}
	public 	boolean		facebookLogin(String userName	,	String password){
	
		return true;
	}
	AreaOutput  ao;	
	
	public 	AreaOutput  	measureArea(float radius ,	int side){
		// return null;
		return ao;
		
	}

}
