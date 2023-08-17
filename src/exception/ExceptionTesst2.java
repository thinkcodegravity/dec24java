package exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTesst2 {

	public static void main(String[] args) {

		try {
			System.out.println("welcome to the calculator software");
			// arithmentic exception - Runtime exception
			int i = 10 / 0;
			// File exception - Compiletime exception
			File f = new File("p:/test.txt");
			f.createNewFile();
		} catch (RuntimeException re) { // child

		} catch (Exception ae) { // parent

		} catch (Throwable ae) { // grandparent

		}
	}

}
