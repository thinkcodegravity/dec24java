package exceptin;

import java.io.File;
import java.io.IOException;

public class ProgramFailures {
	static Person p1; // p1=null
	
	public static void main(String[] args) {
		
		int p=10/0; // ArithmeticException - unchecked exception, runtime exception
		System.out.println(  p1.name );// NullPointerException  - unchecked exception, runtime exception
		// create a file on hard drive
		File f=new File("P:/test.java");
		try {
			f.createNewFile();// IOException - checked Excepton
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// compilation failure. syntax error
		//int b="john"; // compilation error ... cannot run program
		try {	
			// suspect this block of code to fail at some point
			// runtime failure
			System.out.println("hi");
			int x=10/1; // 10
			int y=10 * 1; // 10
			int z=10 * 0; //0
			int a=10/0; // infinity..
			// when program fails in try block.
			// remaining lines below in try block is skipped
			// Exception : can be fixed with code change
			// 2 billion
			System.out.println( a);

		}
		catch(Exception e) {
			// OPTIONAL - only be used WHEN program fails

			// damage control
			
			// helps customer understand the problem
			// take actions to avoid this problem
			System.out.println("please do not divide a number by zero");
			
			// developer : Why program failed, where did program fail
			e.printStackTrace();
		}
		finally {
			// guaranteed blockk : 
			System.out.println("thank you for using calculator");

		}
	}

}
