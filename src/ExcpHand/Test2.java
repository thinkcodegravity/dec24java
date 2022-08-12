package ExcpHand;

public class Test2 {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
			String[] names= {"john","jane","andy"};
			System.out.println( names[5] );
			
		}catch (ArithmeticException ae) {
			System.out.println("please do not divide a number by zero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please access items based on valid index in array");
		}catch (Exception e) {
			System.out.println("sorry for the incon, please try again later");
		}catch (Throwable t) {
			System.out.println("sorry for the incon, please try again later");
		}
	}

}
