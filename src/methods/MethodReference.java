package methods;

public class MethodReference {

	public static void main(String[] args) {
		Product p=new Product();
		AmazonPurchase ap=new AmazonPurchase();
		p=ap.order(p);
		System.out.println( p.name);
		System.out.println( p.quantity);
	}

}
