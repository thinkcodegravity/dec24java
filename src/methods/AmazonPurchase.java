package methods;

public class AmazonPurchase {
	public Product order(Product p1) {
		p1.quantity=20;
		p1=changeOrderQuantity(p1);
		return p1;
	}
	public Product changeOrderQuantity(Product p2) {
		p2.quantity=6;
		p2=changeOrderProduct(p2);
		return p2;
	}
	public Product changeOrderProduct(Product p3) {
		p3=new Product();
		p3.name="samsung";
		return p3;
		
	}
}
