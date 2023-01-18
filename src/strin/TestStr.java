package strin;

public class TestStr {

	public static void main(String[] args) {
		String firstName="john";
		String lastName="doe";
		
		String fullName=firstName.concat(lastName);

		String email="qwe@gmail.com";
		//		FALSE and TRUE  and TRUE 
		// 			FALSE 		and TRUE
		//				FALSE
		if( email.indexOf("@")!=0 && email.contains("@")  && email.endsWith(".com"))
			System.out.println("email is valid");
		else
			System.out.println("email is invalid");
		
		String a="john";// inside pool #aaa
		String b=new String("john");// outside pool #bbb
		String c="john"; // inside pool #aaa
		//if(a == b).. comparing address of variabel a and b 
		if(a.equals(b)) // compare value in respective address
			System.out.println("a and b are same");
		else
			System.out.println("a and b are different");
		
		String loginUserid="john";
		String regisUserid=new String("John");
		if( loginUserid.equalsIgnoreCase(regisUserid) )
			System.out.println("userid matched");
		else
			System.out.println("userid mismatched");
		
		String x="india";
		System.out.println(  x.indexOf("i") );
		System.out.println(  x.lastIndexOf("i") );
		
		String name="john doe";
		System.out.println(   name.substring(5)   );// doe
		System.out.println(   name.substring(2,6)   );// 
		
		String regName="JOhn";
		System.out.println( regName );
		System.out.println( regName.toLowerCase() );
		System.out.println( regName.toUpperCase() );
		
		String reName=" john doe ";
		String logName="john";
		
		System.out.println(reName);
		System.out.println(reName.trim());
		
		
		String regName1="JOhn";// inside pool.. #aaa 
		regName1=regName1.toLowerCase();
		// regName1="john"; // inside pool... #bbb since JOhn is different than john
		System.out.println(regName1);// 
	}

}
