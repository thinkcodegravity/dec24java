import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
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
	public void method3() throws IOException {
		System.out.println("method3");
		File f=new File("H:/testing.txt");
		f.createNewFile();
		// checked exception
	}
}
