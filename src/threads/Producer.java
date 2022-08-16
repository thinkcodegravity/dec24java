package threads;

import java.util.Random;

public class Producer extends Thread {
	Stock supply;

	public Producer(Stock shareProd) {
		supply=shareProd;
	}

	public void run() {
			try{
			while(true){
					synchronized (supply) {
						supply.updateStock(20); // add new stock in the product
						System.out.println("Notify Consumers NEW STOCK ARRIVAL: Total stocks :"+supply.quantity);
						supply.notify(); // notify the consumers for new stock arrival
						supply.wait();// wait until the product runs out of stock and consumer notifies
					}
				}
				
			}catch(Exception e){
				
			}
		
	}

	
}
