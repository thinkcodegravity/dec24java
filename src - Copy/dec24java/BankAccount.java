package dec24java;
// double slash... green marked sentence..... COMMENTS.. DOCUMENTATION
// access is defined by first word - public
// who can use/see/acess this program
public class BankAccount { // opening brackets
	// curly brackets, defines boundary of program
	// tells the machine where program begins and ends
	// variable 
	// Data_type  variable_name = value ; 
	// Values should match the data type defined
	// 123 is numbered value
	// int is numbered java data type
	int acctNumber=123;
	// "old" is group of alphabet and number value
	// int   is numbered java data type
	int age="old";
	long Phone=123123123;
	String email="john@g.com";
	String middleName=25;
    String lastname="doe"; 
    String firstname ="john";
    // defined in another program
    //address
    // fraction or decimal numbers... default data type assumed is Double
    // data type is "float" = value is "double"
    float balance=100.01f;
    double valueOfPie=3.14123123123213; 
    double astronomyCoOrdinates;
    float weight=1/4;
    
    // float = 6 decimal point accuracy 100.123457
    // float conumses 4 byte of memory, double consumes 8 bytes of memory
    boolean accountActive=true;
    char isLoggedin='Y';
} // closing brackets


/*


******* requirement analysis *********
BankAccount
	has-a : STORE information ( Variables )
		acctNumber, phone , email ,lastname , firstname , address, balance, accountActive, 
		loggedIn
	does-a : MANIPULATE information (Methods)
		withdraw - 20
			money decrease
		deposit -40
			money increases

*********** design **********		
acctNumber = variable name (identifier)
123  	= value (information)
int = data type


	Simple information / primitive Data type
		Category =   Java Data type
		numbered data = byte, short, int, long
			acctNumber, phone
			long Phone=123123123;
		fraction data = float, double
			balance
			float balance=100.99;
		single character data - char
			loggedIn
			char loggedIn='Y';
		yes/no data - boolean
			accountActive
	
	Complex information / object Data type
		group of character data = String
			email,lastname=doe,firstname=john
			String email="john@g.com";
		contain sub-information data = another program
			address = 
				street num, build num, city, state, zip, country
				
				
*/