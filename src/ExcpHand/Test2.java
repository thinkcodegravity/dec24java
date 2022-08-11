package ExcpHand;

public class Test2 {

	public static void main(String[] args) {
		try {
			ProgramA pa = new ProgramA();
			pa.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
