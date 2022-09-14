package ExcpHand;

public class Bank {
	int balance=100;
	public void withdraw(int withAmount) throws InsufficentFundException {
		if(balance < withAmount)
		{
			InsufficentFundException ife=new InsufficentFundException("Low bank balance :"+balance+ " , entered withdraw amount "+withAmount);
			throw ife;
		}
		balance=balance-withAmount;
		System.out.println("your new balance is :"+balance);
	}
}
