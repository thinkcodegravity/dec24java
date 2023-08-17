package thrd;

import java.util.Random;


public class Consumer implements Runnable{
	Stock demand;

	public Consumer(Stock shareProd) {
		demand=shareProd;
	}

	public void run() {
			try{
			while(true)
			{
					int order = new Random().nextInt(10 - 1 + 1) + 1;
					synchronized (demand) {
					if(demand.quantity < order) {
						System.out.println("Notify Producer OUT OF STOCK : Total stocks :"+demand.quantity+" orders placed :"+ order);
						demand.notify();// notify producer thread to start producing
						demand.wait();// wait until producer thread notifies new stock
						}
					else
						demand.updateStock(-order);
					}
			}
			
		}catch(Exception e)
		{
			
		}
		
	}

	public String searchAndReplace(String address)
	{
		String newAddress=null;
		boolean searc=address.contains("irving");
		if(searc){
			newAddress=address.replaceAll("irving", "dallas");
		}
		return newAddress;
		
	}
	
}
