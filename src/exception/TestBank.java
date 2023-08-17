package exception;

public class TestBank {

	public static void main(String[] args) throws NotEnoughBalanceException {
		 BankAccount ba=new BankAccount();
		 ba.withdraw(200);
	}

}
