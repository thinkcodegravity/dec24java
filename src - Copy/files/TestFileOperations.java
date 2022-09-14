package files;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class TestFileOperations {
	public static void main(String args[]) throws Exception {
		
		while (true)
		{
			Properties p=new Properties();
			p.load(new FileReader("d:/config.txt"));
			String bilurl=p.getProperty("billing"	);
			System.out.println(bilurl);
			Thread.currentThread().sleep(2000);
		}
		
	}

}
