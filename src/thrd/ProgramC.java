package thrd;

public class ProgramC extends Thread {
	public void run() {
		System.out.println("inside program C");
		for(int i=0;i<1000000000;i++) {
			
		}
		System.out.println("program C counted to 1 billion");
		System.out.println("exit Program C");
	}
}
