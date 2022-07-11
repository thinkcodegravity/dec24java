package thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");
		ProgramA pa=new ProgramA();
		ProgramB pb=new ProgramB();
		ProgramC pc=new ProgramC();
		// start thread, if program implements runnable
		Thread t=new Thread(pa);
		t.start();
		// start thread, if program extends Thread
		pb.start();
		pc.start();
		// 1 to 10
		pb.setPriority(10);
		pc.setPriority(1);
	//	t.join(10000);
	//	System.out.println("main ends");
	//	t.stop();
	}

}
