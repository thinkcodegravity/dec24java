package thrd;

public class TestProdCons {
	public static void main(String args[]) {
		int a;
		a=10;
		int b=10;
		
		
		
		
		
		
		
		Stock Iphone=new Stock();//#aaa
		// extends thread
		Producer Apple= new Producer();
		// implements runabble
		Consumer Users= new Consumer ();
		
		Users.demand=Iphone;// #aaa
		Apple.supply=Iphone;// #aaa
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread t=new Thread(Users);
		
		Apple.start();
		t.start();
	}
}
