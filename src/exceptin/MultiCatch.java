package exceptin;

import java.io.File;
import java.io.IOException;

public class MultiCatch {

	static Person p=new Person();
	public static void main(String[] args) {
		
		try {
			int x=10/0; 
			System.out.println(  p.name );
			File f=new File("c:/test.java");
			f.createNewFile();			
		}
		catch (NullPointerException e1) {
			System.out.println("initialize variable with new");
		}catch (IOException e1) {
			System.out.println("file location does not exist");
		}catch(Throwable e) {
			System.out.println(" generic unhandled error occured");
		}
		
	}

}
