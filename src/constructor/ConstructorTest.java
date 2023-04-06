package constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		// constrcutor/method call input rules
		/*
		 1) number of inputs should match
		 2) data type should match
		 3) order of data type should match
		 */
		Car c1=new Car( "red" );
		Car c2=new Car( 2 );
		Car c3=new Car( "blue",2 );
		Car c4=new Car("green",3);
		Car c5=new Car(); // car program has 3 constructors
						// so compiler didnt provide default constructor
		//() = constructor or method call
		// constructor call always appears after the 
		// new keyword
		BankAccount ba=new BankAccount();
		// BankAccount() is a constructor call
		// BankAccount does not have ANY constructor
		// so compiler provided a default constructor
		
		ba.deposit(100);
		// deposit is a method call
		// deposit method does not exist
	}

}
