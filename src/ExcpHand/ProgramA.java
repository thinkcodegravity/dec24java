package ExcpHand;

import java.io.File;
import java.io.IOException;

public class ProgramA {
	public void method1() {
		System.out.println("inside method1");
		method2();
	}

	public void method2() {
		System.out.println("inside method2");
		method3();
	}

	public void method3() {
		System.out.println("inside method3");
		int x = 100 / 0; // runtime/unchecked exception
		
		String[] names= { "john","jane","andy"};
		System.out.println(   names[5] ); // runtime/unchecked exception
		
		File f=new File("E:/test.txt");
		try {
			f.createNewFile();// compile-time/checked exception
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
