// 
public class Bank {
// balance,address, accountNumber,name,accountActive, deposit,withdraw
//(comments/notes... lines that are ignored by machines, used for documentation)
	
	
	// has-a (balance, accountNumber, accountActive,name,address)
	// variables = vary = CHANGES
	/*
	 data type 
	 1) numeric (accountNumber)
	 	byte=(1 byte- 127),short=(2 byte- 32k),int=(4 byte 2 billion),long=(8 bytes trillions)
	 2) decimal (balance)
	 	float(4bytes. 6 decimal point accuracy),double(8bytes.. more than 6 decimal point accuracy)
	 	
	 3) single character
	 	char
	 4) yes/no (accountActive)
	 	boolean
	 5) complex
	  	a) group of character= (name)
	  		String
	  	b) contains sub information= (address)
	 */
	//	oops fundamental and variable intro

	// data_type   name_of_variable = value
		long creditCard= 123123123132123l;
		float	productPrice	=	99.01f;
		double valueOfPi	=	3.4211321312;
		byte	monthOfYear		=   12;
		int   zip				= 99999;
		double      balance			=	127.0;
		short	  year				=	2022;//(using 2 bytes instead of 8 bytes)
		byte 	  birthDate         =   31;
		short	  accountNumber		=	32000;
		boolean	  accountactive		=	false;
		char	  initial			=	'a';
		String	  name				=	"john";
	// RULE
	// VALUES SHOULD MATCH DATA TYPE
		
	// does-a(withdraw, deposit)
}
