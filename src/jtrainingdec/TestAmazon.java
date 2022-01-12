package jtrainingdec;

public class TestAmazon {

	public static void main(String[] args) {
		Amazon a=new Amazon();
		Customer c=new Customer();
		int p=12;
		System.out.println(c.customerName);
		System.out.println(p);
		a.method1(p,c);
		System.out.println(c.customerName);
		System.out.println(p);
	}

}
