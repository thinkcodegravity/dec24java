package exception;

public class BankAccount {
	int balance=100;
	
	public void withdraw(int withdrawAmount) throws NotEnoughBalanceException {
		if(balance > withdrawAmount)
		{
			balance=balance-withdrawAmount;
			System.out.println("please collect your cash");
		}
		else
		{
			NotEnoughBalanceException neb=new NotEnoughBalanceException
					("please withdraw within your balance:"+balance);
			throw neb;
		}
	}
}
