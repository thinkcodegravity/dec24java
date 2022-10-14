package exceptin;

public class TestException {

	public static void main(String[] args) {
		try{
			
			System.out.println("welcome");
			int i=10/2; // infinite value , but int has max capacity 2 billions
			// this line will be skipeed.
			// bcos program / line above failed abruptly
			
		}catch(Exception e) {// optional, only used when problem occurs
			// damage control
			System.out.println("please do not divide a number by zero");
		}finally { // guaranteed block
			System.out.println("thank you for using our software");
		}
	}

}
