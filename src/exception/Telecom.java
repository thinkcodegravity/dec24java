package exception;

public class Telecom {
	
	
	public void makePhoneCall(long number) throws InvalidPhoneNumberException {
		if( number < 1)
		{
			InvalidPhoneNumberException ip=new InvalidPhoneNumberException
					("phone numbers have to be positive");
			throw ip;
		}
		System.out.println("connecting number");
	}
	
	
	
	
	
	
	
	// No technical limitation.. Program need not fail due to tech errors
	// Business limitation.. telecom s/w cannot dial negative number
	long dialNumber=-100;
	
	long balance=-1000000;
	
	int stock=-15;
	   
}
