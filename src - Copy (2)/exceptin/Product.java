package exceptin;

import java.io.File;
import java.io.IOException;

public class Product {
	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method2() throws IOException {
		method3();
	}

	public void method3() throws IOException {
		File f=new File("p:/test.txt");
		f.createNewFile();
		
	}

}
