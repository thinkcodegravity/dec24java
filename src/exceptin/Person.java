package exceptin;

import java.io.File;
import java.io.IOException;

public class Person {
	String name="john";
	long phoneNumber=0;
	
	int balance=100;
	public void withdraw(int amount) throws InsufficientFundException {
		if(amount <= balance)// 80$ is less than 100$ balance
		{
			balance=balance-amount; // balance = 100-80 = 20
			System.out.println("new balance is:"+balance);
		}
		else {
			InsufficientFundException ife=new InsufficientFundException(" please withdraw less than 100$");
			throw ife; // program to fail on purpose due to business/company rules/restriction
		}
	}
	
	public void dial(long phoneNumber) throws InvalidPhoneException {
		if(phoneNumber > 999999999 ) // 1000000000
			System.out.println("dailing phone "+phoneNumber); 
		else {
			InvalidPhoneException ipe=new InvalidPhoneException("please verify the phone number");
			throw ipe; // program to fail on purpose due to business/company rules/restriction
		}
	}
	
	int stock=20;
	String productName="iphone";
	public void placeOrder(String prod,int orderQuantity) {
		if(productName.equals(prod) == false)
			;// throw user defined exception InvalidProductExce
		if(stock < orderQuantity)
			;// throw user defined exception OutOfStockExcception
		
	}
	public void method1() {
		System.out.println("in method1");
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() throws IOException {
		System.out.println("in method1");
		method3();
	}
	
	public void method3() throws IOException {
		System.out.println("in method1");
		int i=10/0; // runtime/unchecked exception (arithmetic
		
		File f=new File("g:/test.txt");
		f.createNewFile(); // checked exception
		
		
	}
}
