package exceptin;

import java.io.File;
import java.io.IOException;

public class TestExcce3 {
	public static void main(String args[]) {

		
		
		try {
			Bank b=new Bank();
			b.withdraw(150);
			
			int x = 10;
			int y = 0;
			int z = x / y; // arithmetic exception.. divide by zero, gives infinite result
			// need NOT be CHECKED with try and catch
			// UNCHECKED or RUNTIME

			File f = new File("p:/test.txt");
			f.createNewFile(); // IOException.. drive location does not exists
			// need be CHECKED with try and catch
			// CHECKED or COMPILETIME
		}  catch (IOException ie) {

		} catch (NullPointerException ie) {

		} catch (RuntimeException ie) {

		} catch (Exception ie) {
			ie.printStackTrace();
		}catch (Throwable ie) {

		}
	}
}
