package exception;

public class InvalidPhoneNumberException extends Exception{
	public InvalidPhoneNumberException (String message) {
		super(message);// parent 
						// super.age = parent program age variable
						// super.abcd(); = parent program abcd method
						// super(message) = parent program constructor with string input
	}
}
