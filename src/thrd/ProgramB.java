package thrd;

import constructor.Calculator;

public class ProgramB extends Calculator implements Runnable{
	public void run() {
		System.out.println("inside program B");
		for(int i=0;i<1000000000;i++) {
			
		}
		System.out.println("program B counted to 1 billion");
		System.out.println("exit Program B");
	}
}
