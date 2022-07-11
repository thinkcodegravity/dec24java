
public class ChaseAccount {
	int balance=100;
	public void withdraw(int amount) throws InsufficientFundExcception {
		if(amount > balance) {
			throw new InsufficientFundExcception("Cannot withdraw above your balance");
		}
		else
			balance=balance-amount;
	}
}
