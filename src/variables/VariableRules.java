package variables;

public class VariableRules {
	/* 
	 1) naming guidelines
	 		follow camel case starting from second word
			accountBalance
	 2) variable naming convention
	 		can contain alphabets digits _ $
	 		cannot start with a number
	 		cannot contain spaces 
	*/
	int age_123;
	int age11;
	int _age12;
	// int 12age;
	/*
	 	Data_type   Variable_name = Data
	 	3) Data type and Data shuld match
	 */
	int x="john"; // int is NUMERIC data type , john is ALPHABETIC data
	
	/*
	 	= assignment opertor
	 	int x = 10;
	 	LHS   = RHS 
	 	take data/value of RHS will be stored/assigned in LHS variable
	 	4) LHS can always be a variable
	 	5) RHS can be variable or value 
	 		RHS if contains variable .. program substitues its value
	 	6) RHS always resolves/converts into a SINGLE value
	 	7) Variable has to be declared FIRST
	 	8) RHS if a variable it should match LHS variable
	 */
	//20=int c;
	// RHS is value
	int a=10; // value/data in a is : 10
	// RHS is variable = substitue variable with its value
	int b=a; //  int b = 10;
	// RHS is operation = solve that operation
	int c=10+20; // int c=30;
	// RHS combination of variable and value and operations
	int d=a+b+20; 
	// int d=10+b+20;
	// int d=10+10+20;
	// int d=40;
	// LHS IS ALWAYS VARIABLE ..... RHS IS ALWAYS SINGLE VALUE
	/*
	 	declaration : Allows program to decide what data can be stored.
	 	initialization : First value ever stored in the variable 
	 	reassignment : Change previous value for the variable
	 */
	String name; // declaration
	
	int abc='a';
	float xyz=123;
	
	/* 
	 	numeric = 
	 	byte = 1 byte ( -128 to 127)
		short = 2 bytes ( -32768 to 32767)
		int = 4 bytes ( 2 billion )
		long = 8 bytes ( trillions )
	
	*/
	byte aa=129;
	short bb=32000;
	
	byte birthDate=25;  // 1-31
	// Facebook - 2 billion
	// long data type : 8 byte X 2 billion = 16 GB memory
	// byte data type : 1 byte X 2 billion = 2 GB memory
	
	int zipcode=65665;	//(5 digit code = 00001 to 99999)
	short birthYear=2020;	
	long phonenumber=9234567890l;// 9999999999 .. 9 billion 999 million 999k 999 
	
	/*
	 	fractional 
	 	float = 4 bytes ( accuracy of 6 digit decimal point)
	 	double = 8 bytes
	 */
	float productPrice;// 123.99
	double valueOfPi;// value of pi 
	float weight; // 55.230
	
}
