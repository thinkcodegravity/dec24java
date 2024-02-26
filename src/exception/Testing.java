package exception;

import java.io.File;
import java.io.IOException;

public class Testing {
	public void method1() throws IOException {
		method2();
	}

	public void method2() throws IOException {
		method3();
	}

	public void method3() throws IOException {
		method4();
	}

	public void method4() throws IOException {
		File f=new File("d:/abcd.txt");
		f.createNewFile();
		
	}
}
