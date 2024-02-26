package exception;

public class TestExc4 {

	public static void main(String[] args) {
		Telecom t=new Telecom();
		try {
			t.makePhoneCall(-100);
		} catch (InvalidPhoneNumberException e) {
			e.printStackTrace();
		}
	}

}
