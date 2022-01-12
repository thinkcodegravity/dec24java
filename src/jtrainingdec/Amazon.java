package jtrainingdec;

public class Amazon {
	public void method1(int x,Customer c1) {
			x=30;
			method2(x,c1);
			c1.customerName="jane";
			
	}
	public void method2(int y,Customer c2) {
		y=30;
		c2.customerName="mike";
		c2=new Customer();
		
	}
}
