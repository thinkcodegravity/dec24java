package methodCall;

public class Bank {
	static Accountant acc=new Accountant();
	public static void main(String args[]) {
		int test=acc.c.add(10, 20);
	}
}
