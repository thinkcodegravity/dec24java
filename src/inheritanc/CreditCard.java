package inheritanc;
//concrete = complete
public class CreditCard extends APayment{
	public void payment() {
		System.out.println("transferring from credit card");
	}
}