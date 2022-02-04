package thread;

import java.util.Date;

public class ProgramB extends Thread {
	public void run() {
		int billions=0;
		System.out.println("ProgramB start");
		int i=0;
		while(i < 10000000000l) {
			i++;
			if (i%1000000000l==0) 
			{
				billions++;
				System.out.println(new Date()+" Program B counted to "+(billions)+" billion");
				
			}
		}
		System.out.println("ProgramB ends");
	}
}
