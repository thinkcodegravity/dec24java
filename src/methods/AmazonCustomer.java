package methods;
public class AmazonCustomer {
	public static void main(String[] args) {
		System.out.println("start shopping");
		checkOut("iphone"); // method calls
		System.out.println("checkout complete");
	}
	public static void checkOut(String product) {
		System.out.println("check out :"+product);
		Amazon amzn=new Amazon();
		amzn.payment();// EXTERNAL method calls
		System.out.println("order confirmation 12345");
	}
/* method stack = Last in First Out
 main #5
 
 
 
 */
	
	
	
}
