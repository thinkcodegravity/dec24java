package exception;

import java.io.File;
import java.io.IOException;

import methodCall.Person;

public class ExceptionTest1 {

	static Person p;
	public static void main(String[] args) {
		
		
		Calculator c=new Calculator();
		try {
			// arithmetic problem
			int res=c.div(25, 5);
			// file / drive problem
			File f=new File("D:/java.txt");
			f.createNewFile();
		}catch(ArithmeticException e) {
			System.out.println("please do not divide by zero");
		}catch(IOException io) {
			System.out.println("please check the file drive location");
		}
		//System.out.println(res);
		
	}

}