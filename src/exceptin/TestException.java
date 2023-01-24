package exceptin;

import java.io.File;
import java.io.IOException;

public class TestException {

	static Student s1=new Student(); // declared & initialized
	static Student s2; // only declaration, not initialized
	
	public static void main(String[] args) {
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
			int num1=100;
			int num2=2;
			try { // code/lines that we suspect might fail
				// all lines are optional 
				// - in the event of failure some lines might be skipped
				System.out.println("dividing numbers");
				int result=num1/num2;
				System.out.println(result);
				System.out.println("dividing completed");
				
				File f=new File("k:/test.video");
				f.createNewFile();
				
				
			}
			// inbuilt / java library execption
			catch(ArithmeticException e) {// safety net
				// take action if something goes wrong
				// all lines are optional
				// in the event of succes this code will be skipped
				System.out.println("please do not divide a number by zero");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("please enter proper hard drive location");
			}
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				System.out.println("please enter proper hard drive location");
			}
			finally {
				// mandatory block... guaranteed block
				System.out.println("thank you for using our calculator software");
			}
			
	}

}
