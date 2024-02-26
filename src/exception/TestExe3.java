package exception;

import java.io.File;
import java.io.IOException;

public class TestExe3 {

	public static void main(String[] args) {
		 
		// arithmetic (Runtime exception)
		int x=10/0;
		
		File f=new File("D:/java.txt");
		try {
			f.createNewFile(); // checked exception
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
