package threads;

import java.util.Date;

import methodCall.Person;

public class ProgramA  extends Person implements Runnable{
	public void run(  ) {
		System.out.println("Program A entered");
	
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0) {
				System.out.println("program A counted a "+i);
				System.out.println("program A is going into timed waiting");
				/*
				try {
					Thread.currentThread().sleep(10000);
				}catch(Exception e) {
					e.printStackTrace();
				}*/
				System.out.println("program A is waking up again");
				
			}if(i==3000000000l)
				break;
		}
		System.out.println("program A ends");
	}
}
