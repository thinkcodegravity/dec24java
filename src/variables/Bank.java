package variables;

public class Bank {
	// has-a (variable)... declare or initialization
	int balance = 100;
	
	// does-a (methods)
	public void withdraw() {
		balance=50; // reassignment , process/change information
	}
	public void deposit() {
		balance=120; // reassignment , process/change information
	}
}
//initially = 100
//1) deposit =120
//2) withdraw = 50

//initially = 100
//1) withdraw = 50
//2) deposit =120

