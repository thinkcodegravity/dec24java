package threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");
		ProgramA pa=new ProgramA();
		pa.start();
		//pa.join();// indefiently
		pa.join(100000);//
		pa.stop();
		System.out.println("main ends");
	}

}
