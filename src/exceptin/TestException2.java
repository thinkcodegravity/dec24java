package exceptin;

import java.io.File;
import java.io.IOException;

public class TestException2 {

	
	public static void main(String[] args) {

		// code that does arithmetic operation
		int i=10/0; // arithmetic problem in divide by zero
		// unchecked/runtime exception... need not be checked while ccoding
		
		
		// code that will create new file on hard drive
		File f=new File("g:/test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// no g drive exists on laptop
		// checked exception - required to be prepared
		// with exception handling code
		
	}

}
