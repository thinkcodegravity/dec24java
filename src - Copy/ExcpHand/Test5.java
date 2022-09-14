package ExcpHand;

public class Test5 {

	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.withdraw(500);
		} catch (InsufficentFundException e) {
			e.printStackTrace();
		}
	}

}
