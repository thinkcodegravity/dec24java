package methods;

public class Amazon {
	public void payment() {
		System.out.println("begin payment");
		transfermoney();// method calls
		shipping();// method calls
		warehouse();// method calls
		System.out.println("payment complete");		
	}
	public void transfermoney() {
		System.out.println("Transfer money begin");
		System.out.println("Transfer money complete");
		return ;
	}
	public void shipping() {
		System.out.println("start shipping to address");
		return ;
	}
	public void warehouse() {
		System.out.println("deduct warehouse iphone quantity by 1");
		int stock=10;
		int orderquantity=1;
		stock=stock-orderquantity;// stock=10-1// stock=9
		return ;
	}
	
}
