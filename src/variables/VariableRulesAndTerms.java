package variables;

public class VariableRulesAndTerms {
	// HAS-A relationship
	// BankAccount HAS-A balance,accountNumber, routingNumber
	// variable = keeps changing
	
	int age=20;
	// int = "data type" ( numeric information is stored here)
	// age = "variable name"
	//	20 = "value" information
	
	// "declaration"
	// every variable used in a program should be defined / declared first
	// writing data type of a variable
	double weight;
	
	// initialization
	// giving a value for the first time
	{
		int balance=100; // declare variable only once
		balance=70;
		balance=120;
		
		int accountNumber; // declaration
		accountNumber=12345; // initialization
		accountNumber=23422; // "reassignment" (changing value after the first time)
	}
	
	int x=100;
//  LHS = Left Hand Side of equal sign
//  RHS = Right Hand Side of equal sign
	
	// DATA TYPE = LHS ... highlighted in purple color Or appears as the first word
	// VARIABLE = highlighted in blue without single or double quotes
	// VALUE looks like literal number 123,fraction number 123.1,
	//	written in double quote,	"white",
	//  written in signle quote 'a',true
	String abc="white"; 
	int height=150;// 
	char charVar='d';
	double ss=10.0;
	boolean b=true;
	
	// Variable naming rules
	// should start with alphabet or $ or _
	// can contain any alphabet or number or $ or _
	int aaa12$_=10;
	
	// rule 1) variable has to be declared before using in program
	// rule 2) values can appear only on RHS
	String color="white"; // 1) String data type is mandatory the first time color is mentioned
	int aage=10;
	20=aage; // 20 is a value and should be on RHS
	"nissan"=String car; // nissan is a vlue... and should be on RHS
	// rule 3) variable can appear on LHS or RHS
	
	int p=10;
	int q=20;
	int r=p;
	
	
	
	
	
}
