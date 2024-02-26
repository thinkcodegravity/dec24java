package exception;

import java.io.IOException;

public class TestExc5 {

	public static void main(String[] args) {
		Testing t=new Testing();
		try {
			t.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 method4 : 20 (checked exception)
 method3 : 15
 method2 : 11
 method1 : 7
 main 	 : 7
 */
