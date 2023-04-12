package exceptin;

public class BankAccount {
	int balance=100;
	public void withdraw(int withdrawAmount) throws InsufficientFundException {
		if(balance >= withdrawAmount)
			balance=balance-withdrawAmount;
		else if (balance < withdrawAmount) {
			InsufficientFundException ife=new InsufficientFundException
					("please withdraw less than your balance : 100$");
			throw ife;
		}
			
	}
}
