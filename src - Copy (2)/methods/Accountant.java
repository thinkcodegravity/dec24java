package methods;

public class Accountant {

	public static void main(String[] args) {
		// Communication between 2 programs
		// send input/receive output
		// send request/receive response
		// ask question/ receive answer
// message passing technique	
// METHOD CALL
		Calculator c=new Calculator();
//1) create reference to the program, that
//	you seek service from
		// method caller
		// INPUT : 50,43,"jane"
		// OUTPUT : result
		int y=30;
		int result=c.add(50, y,"jane");
/*
 METHOD CALL/INVOKE
 Rules on 
 passing input/request/data
 1) number of inputs should match
 2) data type of input should match
 3) order of input should match
 4) do not declare variables here..
 	values or already declared variable
 	
 Rule on
 handling return type/output
 1) method output should match
 	variable on LHS
 		
 		
 */
	}

}