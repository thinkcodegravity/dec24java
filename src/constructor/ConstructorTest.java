package constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		
		Car customer1=new Car( "red" );// constrcutor call
		Car customer2=new Car( 2 );
		Car customer3=new Car( "black",6 );
		
		// method input rules
		// 1) number of input
		// 2) data type of input
		// 3) order of input
		
		BankAcc ba1=new BankAcc(  );
	}

}
