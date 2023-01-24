package exceptin;

public class Bank {
	int balance=100;
	int x=-1000000000;
	long y=-1;
	
	public void withdraw(int amount) throws InsufficientFundException {
		if(amount > balance)
		{
			InsufficientFundException ife=new InsufficientFundException 
					("withdraw less than 100");
			throw ife; // program will fail on this line
		}
		
		balance=balance-amount;
		// balance=100 - 150
		// balance= -50;
		// NO technical limitation
		// business limitation
	}
}

// withdraw(150);