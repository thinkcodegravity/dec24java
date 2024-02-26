package thrd;

// Use implements Runnable
// if program already inherits another program
public class ProgramA extends Thread{
	public void run() {
		System.out.println("inside program A");
		for(int i=0;i<1000000000;i++) {
			
		}
		System.out.println("program A counted to 1 billion");
		System.out.println("exit Program A");
	}
	public void test() {
		
	}
}
