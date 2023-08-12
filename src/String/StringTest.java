package String;

public class StringTest {
	int a=0;
	String b;
	public static void main(String args[]) {
		String a="john"; // in the pool. shared
		String b="john";// in the pool. shared
		String c=new String("john"); // outside the pool. new memory
		String d=new String("john");// outside the pool. new memory
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println( d );
		if(a .equals(d) )
			System.out.println("they are same ");
		else
			System.out.println("they are different ");
		
		String emailid="j@gmail.com";
		if(emailid.contains("@") && emailid.endsWith(".com") && emailid.indexOf("@")!=0)
	  //if(  true &&  false )
			System.out.println("valid email id");
		else
			System.out.println("invalid email id");
		
		String registeredUsername="john";
		String registeredpwd="john1!";
		
		String loginUsername="john";
		String loginpwd="john1!";
		if(registeredUsername.equalsIgnoreCase(loginUsername) && registeredpwd.equals(loginpwd))
			System.out.println("login is succesfull");
		else
			System.out.println("login is failed");
		
	}
}
