package thrd;

import java.util.Date;

public class Alarm extends Thread{
	public void run() {
		System.out.println("setup alarm for 5 seconds "+new Date());
		try {
			this.currentThread().sleep( 5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		//5000 milli seconds = 5 seconds
		System.out.println("wake up wake up:"+new Date());
	}
}
