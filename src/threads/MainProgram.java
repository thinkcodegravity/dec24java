package threads;

public class MainProgram {
// sequential
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main entered");
		ProgramA pa = new ProgramA();
		Thread t=new Thread(pa);
		t.start();// instructions to main
// prgm to "start" the code in run method
// parallely
		System.out.println("in main from program a");
		
		ProgramB pb = new ProgramB();
		pb.start();
		System.out.println("in main from program b");
		
		ProgramC pc = new ProgramC();
		pc.start();
		System.out.println("in main from program c");
		
		ProgramD pd = new ProgramD();
		pd.start();
		System.out.println("in main from program d");
		
		//while(pb.jobDone == false)
		//	Thread.currentThread().sleep(1000);
		//pb.stop();
		t.setPriority(Thread.MIN_PRIORITY);
		pb.setPriority(Thread.MAX_PRIORITY);
		pc.setPriority(Thread.MIN_PRIORITY);
		pd.setPriority(Thread.MIN_PRIORITY);
		System.out.println("exit Main");
	}

}
