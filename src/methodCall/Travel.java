package methodCall;

public class Travel {
	public void cali() {
		System.out.println("entered cali");
		ohio();
		System.out.println("exited cali");
	}

	public void ohio() {
		System.out.println("entered ohio");
		washington();
		System.out.println("exited ohio");
	}

	public void washington() {
		System.out.println("entered washington");
		System.out.println("exited washington");
	}
}
