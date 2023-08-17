package thrd;

public class MainProgram {

	public static void main(String[] args) {
		Alarm al=new Alarm();
		al.start();
		/*
		ProgramA pa=new ProgramA();
		ProgramB pb=new ProgramB();// thread - NEW state
		ProgramC pc=new ProgramC();
		// start method signal java runtime
		// to start executing all the code in
		// run method parallely

		// make programA convertible/adaptable
		// to thread feature
		Thread t=new Thread(pa);
		t.start();
		pb.start(); // thread - runnable... capable of executing the job
		pc.start();
		*/
	}

}
