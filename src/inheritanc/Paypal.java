package inheritanc;
//concrete = complete
public class Paypal extends APayment{
	public void payment() {
		System.out.println("transferring from paypal account");
	}
}