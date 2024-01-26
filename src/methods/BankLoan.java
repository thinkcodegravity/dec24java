package methods;

public class BankLoan {

	public static void main(String[] args) {
		int principal=10000;
		int time=12;
		int rate=5;
		/*
		 1) 10000 X 12 = 120000
		 2) 120000 X 5 = 600000
		 3) 600000/100 = 6000
		 */
		// simpleInterest = p * T * r / 100
		Calculator cc=new Calculator();
		int temp1= cc.mul(principal, time);
		int temp2= cc.mul(temp1 , rate);
		int simpleInterest= cc.div(temp2, 100);
		System.out.println( simpleInterest);
	}

}
