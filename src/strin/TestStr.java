package strin;

public class TestStr {

	public static void main(String[] args) {
		String a="john"; // #abc , sharing inside pool
		String b="john"; // #abc , sharing inside pool
		String c=new String("john"); // #xyz , outside pool
		String d=new String("john"); // #pqr , outside pool

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// equal sign with string...
		// DOES NOT COMPARE VALUES(john)
		// compares address
		if( a==b)// NOT john==john, #abc==#abc
			System.out.println(" a and b are same");
		if( a==c)// #abc==#xyz
			System.out.println(" a and c are same");
		if( c==d)// #xyz==#pqr
			System.out.println(" c and d are same");

		System.out.println("*************");
		if( a.equals(b))// john==john
			System.out.println(" a and b are same");
		if( a.equals(c))// john==john
			System.out.println(" a and c are same");
		if( c.equals(d))// john==john
			System.out.println(" c and d are same");

		String name="john";
		//abcd1@D
		String email="john@gmail";
		if(email.endsWith(".com")== false
				|| email.charAt(0) == '@' 
				|| email.indexOf("@") == -1)
			System.out.println("invalid email id");
		
		else
			System.out.println("valid email id");
		String regUid="joHn";
		String regPwd="John1!";
		String loginUid="John";
		String loginPwd="john1!";
		// traditionally used
		// equalsIgnoreCase used for userid
		// equals used for password
		if(regUid.equalsIgnoreCase(loginUid))
		{
			System.out.println("yes login uid is correct");
		}
		String x="JoHN@gmail.com";
		System.out.println(x);
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		
		String loginEmail=" john@gmail .com ";
		System.out.println( "::"+loginEmail+"::");
		System.out.println( "::"+loginEmail.trim()+"::");
	}

}
