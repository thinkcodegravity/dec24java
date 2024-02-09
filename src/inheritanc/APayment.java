package inheritanc;
//abstract = incomplete partial
public abstract class APayment implements IPayment{
	public void address() {
		System.out.println("cllecting address");
	}
	public void confirmation() {
		System.out.println("sending email");
	}
}
