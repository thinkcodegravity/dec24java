package String;

import exception.Person;

public class StringTest2 {

	public static void main(String[] args) {
		 int age=10; // literal values for primitive
		 Person p=new Person(); // address/reference value for complex
		 
		 String name="john"; // literal values are inside string pool
		 String name2=new String("john"); // new values are outside the pool
		 String name3="John";	
		 String name4=new String("john");	
		 System.out.println(name);
		 System.out.println(name2);
		 System.out.println(name3);
		 System.out.println(name4);
		 
		 if(name.equals(name2))
			 System.out.println("name and name2 are same");
		 else
			 System.out.println("name and name2 are different");
		 
		 if(name.equalsIgnoreCase(name3))
			 System.out.println("name and name3 are same");
		 else
			 System.out.println("name and name3 are different");
		  
		 
		 String city="Newyork";
		 System.out.println(  city.charAt(4) );
		 
		 String firstName="john";
		 String lastName=" abcd";
		 
		 System.out.println(firstName.concat(lastName));
		 
		 String email="john@gmail.com";
		 if( email.contains("@")  == false || email.endsWith(".com")  == false || email.startsWith("@") == true )
			 System.out.println("invalid email ");
		 else
			 System.out.println("valid email");
		 
		 String abc="java";
		 System.out.println( abc.indexOf("a") );
		 System.out.println( abc.lastIndexOf("a") );
		 System.out.println( abc.replace("a", "o"));
		 
		 String pqr="JOhn";
		 System.out.println(  pqr.toLowerCase() );
		 System.out.println(  pqr.toUpperCase() );
		 
		 String qwe="   John abcd   ";
		 System.out.println(qwe);
		 System.out.println(qwe.trim());
		 
	}

}
