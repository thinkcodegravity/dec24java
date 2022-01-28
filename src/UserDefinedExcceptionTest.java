
public class UserDefinedExcceptionTest {

	public static void main(String[] args) {
		ChaseAccount ca=new ChaseAccount();
		ChaseAccount ca2=new ChaseAccount();
		ChaseAccount ca3=new ChaseAccount();
		try {
			ca.withdraw(1000);
			ca2.withdraw(10);
			ca3.withdraw(30);
		} catch (InsufficientFundExcception e) {
			e.printStackTrace();
		}
	}

}
