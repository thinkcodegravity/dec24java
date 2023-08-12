package file;

import java.io.Serializable;

public class Product implements Serializable {
	String name;
	String price;
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
