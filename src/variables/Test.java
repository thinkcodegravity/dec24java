package variables;
// package - tells the category/group that this program belongs to

// public - access privilege
// class - indicates this is the java program
// test - name of the program... should match file name..
// green line above are COMMENTS. used for making notes about the code
//		these green lines are NOT code.. device/machine will ignore
//		these lines.
public class Test {
	// curly bracket defines boundary between programs and services that the program provides
	//has-a or VARIABLE
	// "data type"   "name" = "value"    
	boolean   onlineStatus = true;
	// age
	int 	 person_Age1  = 20;
	String   school_class="chemistry";
	String address_line_1 = "123 street";
	String address_line_2 = "xyz apartment";
	
	// height
	double	height	= 3.4;
	// name
	String name	= "andy";
	// letter
	char favoriteCharacter = 'a';
	int zipcode=999999;
	// month
	byte month=11;
	// choose data type carefuly to save memory
	// fb stores birth month of all their 1 billion customers
	// choosing int requires fb to consume 1 billion customer X 4 byte int= 4 GB
	//	choosing byte instead fb will consume 1 billion customer X 1 byte int= 1 GB
	// year
	short year=2023;
	byte date=31;
	int zipcod=99999;
	long phoneNumber=9234567890l;
	
	// float = 4 byte of memory and has accuracy of 6 decimal point
	// double = 8 byte of memory and has greater decimal accuracy
	
	// productPrice
	// float price=99.99
	
	// value of pi
	// double pi=3.123132312312;
	
	// RULES
	
	/*
	 Data type and its value should match
	 name should not have spaces
	 special characters not allowed except $ and _
	 numbers should appear after the first letter 
	 dont use keyword ( purple colored letter in program )
	 */
	// data type
	/* Digital data type
	 	Simple data type
	 		Numeric data : byte -128 to 127 consumes 1 byte of memory
	 					   short -32768 to 32767 consumes 2 byte of memory
	 					   int 2 billions consumes 4 byte of memory
	 					    long : trillions consumes 8 byte of memory
	 		Fractional data : float , double
	 		Single Character data : char
	 		yes/no type data : boolean value is true or false
	 	complex data type
	 		Group of characters : String
	 		complex : create another program
	 */
}


