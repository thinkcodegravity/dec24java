package jtrainingdec;

public class Amazon {
	public Customer method1(int x,Customer c1) {
		c1=new Customer();
		x=30;
		method2(x,c1);
		c1.customerName="jane";
		return c1;	
	}
	public void method2(int y,Customer c2) {
		y=30;
		c2.customerName="mike";
	}
}
