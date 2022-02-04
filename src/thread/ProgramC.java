package thread;

import java.util.Date;

public class ProgramC extends Thread {
	public void run() {
		System.out.println("ProgramC start");
		int billions=0;
		int i=0;
		while(i < 10000000000l) {
			i++;
			if (i%1000000000l==0) 
			{
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				billions++;
				System.out.println(new Date()+" Program C counted to "+(billions)+" billion");
			}
		}
		System.out.println("ProgramC ends");
	}
}
