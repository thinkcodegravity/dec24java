import java.io.IOException;

public class ExceptionHandlingTest {

	static Person p1=new Person(); // address #abc
	static Person p2; // null
	
	public static void main(String[] args) {
		System.out.println("entering main");
		try {
			int a=-100000000;
			long b=123l;
			
			System.out.println(p1.name);
			String s=p2.name;
			System.out.println(1);
			int c=10/0;
			String[] names=new String[4];
			System.out.println( names[5] );
			System.out.println(2);
		}
		catch(ArithmeticException ae) {
			System.out.println("division error");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of size range");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		catch(Throwable e) {
			System.out.println("array index out of size range");
		}
		finally {
			System.out.println(4);
		}
		System.out.println("exiting main");
	}

}
