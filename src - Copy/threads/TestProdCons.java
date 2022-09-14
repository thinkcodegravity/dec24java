package threads;

public class TestProdCons {
	public static void main(String args[]) {
		int a;
		a=10;
		int b=10;
		
		Stock Iphone=new Stock();
		// extends thread
		Producer Apple= new Producer(Iphone);
		// implements runabble
		Consumer Users= new Consumer (Iphone);
		Thread t=new Thread(Users);
		
		Apple.start();
		t.start();
	}
}
