package reference;

public class Bank {
	public static void main(String args[]) {
		Calculator c=new Calculator();
		int principal=10000;
		int time=30;
		int rate=5;
		int x=c.mul(principal,time);
		//int x=c.mul(10000,30);
		// giving control/input to mul
		// int x=300000
		int y=c.mul(x,rate);
		// int y=c.mul(300000,5);
		// giving control/input to mul
		// int y=1500000;
		int z=c.div(y,100);
		// int z=c.div(1500000, 100 );
		// giving control/input to div
		// int z=15000;
		System.out.println( z );
	}
}
