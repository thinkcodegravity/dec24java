package exceptin;

public class UserDefExcepTest {

	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.withdraw(40);
			System.out.println("withdraw complete");
			p.dial(123);
			p.placeOrder("samsung", 1);
			p.placeOrder("iphone", 25);
			System.out.println("phone dial complete");
		} catch (InsufficientFundException e) {
			e.printStackTrace();
		} catch (InvalidPhoneException e) {
			System.out.println("invalid phone");
			e.printStackTrace();
		}
	}

}
