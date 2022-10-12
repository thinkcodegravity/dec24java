package inheritance;
// 100% incomplete program
// abstract program
// abstract = incomplete
public  interface ICar {
	int a=10; // constant/unchangeable/"final"
	
	public void on();
	public void off();
	public void drive();
	default void test() {
		System.out.println("testing car");
	}
	public void takeTurn();
}
/*
	public class BankAccount
		int balance=100; // variable store information
		public void withdraw(){// method manipulate/change information
			deduct/change balance to lower amount
		}
		public void deposit(){
			add/change balance to higher amount
		}
	public class AmazonStore{
		int warehouseIphone=100;
		
		public void buyIphone(){
			decreaase warehouse quantity
		}
	
		public void sellIphone(){
			increase warehouse quantity
		}
	
	}
*/