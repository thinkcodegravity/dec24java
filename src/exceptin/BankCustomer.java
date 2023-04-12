package exceptin;

public class BankCustomer {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		try {
			ba.withdraw(125);
		} catch (InsufficientFundException e) {
			e.printStackTrace();
		}
	}

}
