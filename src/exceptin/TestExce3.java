package exceptin;

import java.io.File;
import java.io.IOException;

public class TestExce3 {
	static Person p;

	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			int i = 10 / 2; // arithmetic problem in divide by zero
			File f = new File("d:/test.txt");
			f.createNewFile(); // file io exception
			System.out.println(p.name); // null pointer exception
		} catch (IOException e) {
			System.out.println("please check the file location");
		} catch (ArithmeticException ae) {
			System.out.println("please do not divide by zero");
		} catch (NullPointerException np) {
			System.out.println("please initialize the null variable");
		} catch (Throwable t) {
			System.out.println("we are expericing technical probleam, please try agin later");
		}
	}

}
