package exceptin;

import java.io.File;
import java.io.IOException;

public class Test {
	public void method1() {
		System.out.println("method1");
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method2() throws IOException {
		System.out.println("method2");
		method3();
	}

	// throw failure responsibility
	// to the caller
	public void method3() throws IOException {
		System.out.println("method3");
		int num1 = 12;
		int num2 = 0;
		int divResult = num1 / num2;
		System.out.println(divResult);
		File f = new File("p:/test.txt");
		f.createNewFile();
		 
		
	}
}
