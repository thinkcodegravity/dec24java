package thread;

import java.util.Date;

public class ProgramA extends Parent implements Runnable {
	public void run() {
		int billions=0;
		System.out.println("ProgramA start");
		int i=0;
		while(i < 10000000000l) {
			i++;
			if (i%1000000000==0) 
			{
				billions++;
				System.out.println(new Date()+" Program A counted to "+(billions)+" billion");
			}
		}
		System.out.println("ProgramA Ends");
	}
}
