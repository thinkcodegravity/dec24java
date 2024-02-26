package thrd;

public class MainProgram {

	public static void main(String[] args) throws InterruptedException {
		
		ProgramA pa=new ProgramA();
		ProgramC pc=new ProgramC();
		
		ProgramB t=new ProgramB();// thread - NEW state
		Thread pb=new Thread(t);
		pb.start();
		
		pa.start();
		
		pc.start();
		pa.setPriority(10);
		pb.setPriority(5);
		pc.setPriority(1);
		
		System.out.println("main ends");
		// start method signal java runtime
		// to start executing all the code in
		// run method parallely
		
		// make programA convertible/adaptable
		// to thread feature
		/*
		Thread t=new Thread(pa);
		t.start();
		pb.start(); // thread - runnable... capable of executing the job
		pc.start();
		*/
	}

}
