package exception;

import java.io.File;
import java.io.IOException;

public class Tests {
	public void method1() {
		System.out.println("hi 1");
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method2() throws IOException {
		System.out.println("hi 2");
		method3();
	}

	public void method3() throws IOException {
		System.out.println("hi 3");
		File f=new File("p:/test.txt");
		f.createNewFile();
		
	}

}
