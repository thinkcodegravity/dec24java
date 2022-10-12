package strin;

import methods.Person;

public class TesttString {

	public static void main(String[] args) {
		int a=10; // literal value
		Person p=new Person(); // reference values
		
		String name1="john";
		String name2="john";
		String name3=new String("john");
		String name4=new String("john");
		
		if(name1.equals(name2)) 
			System.out.println("name1 and 2 are same");
		else
			System.out.println("name1 and 2 are different");
			
		if(name1.equals(name3)) 
			System.out.println("name1 and 3 are same");
		else
			System.out.println("name1 and 3 are different");
		
		String email="john@gmail.com";
		if(email.indexOf("@")!=0 &&
				email.contains("@") && email.endsWith(".com"))
			System.out.println("email is valid");
		else
			System.out.println("email is invalid");
		
		
		String regUserid="john";
		String regPwd="john1!";
		
		String loginUserid="John";
		String loginPwd="john1!";
		
		if(regUserid.equalsIgnoreCase(loginUserid) && regPwd.equals(loginPwd))
			System.out.println("welcome to our website");
		else
			System.out.println("login failed");
		
		String xyz="john";
		System.out.println( xyz.toUpperCase());
		
		String pqr="JoHn";
		System.out.println( pqr.toLowerCase());
		
		String registering="  john doe   ";
		String login="john";
		System.out.println( registering );
		System.out.println( registering.trim() );
		
		
	}
}
