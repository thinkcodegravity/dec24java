
public class BankAccount 
{
// has-A = balance, name, accountNumber,isActive,address
	
	// primitive data type - 
	double    balance=1.0; // literal value
	int   account_Number=67899; // -128 to 127
	boolean    isActive=false;
	char accountType='A';
	
	// object/complex data type
	String   name="john doe";
	Address customersAddress=new Address();
	
	int phone_number123;
	
	
	
	
	
	public void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
	}

	public void deposit(int depositAmount){
		balance = balance + depositAmount;
	}
}