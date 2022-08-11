package string;

public class Test {

	public static void main(String[] args) {
		int x=10;// primitive
		// reference or complex or object data type
		String a="john";// #aaa.. in pool, share same john object address#aaa
		String b="john";// #aaa.. in pool, share same john object address#aaa
		String c=new String("john");// #yyy.. outside pool, different john object address#yyy
		String d=new String("john");// #zzz.. outside pool, different john object address#yyy
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println( d );
		if( a.equals( b ) )
			System.out.println( " a and b are same");
		if( a.equals( c ) )
			System.out.println( " a and c are same");
		if( c.equals( d ) )
			System.out.println( " c and d are same");
		
		String email="qw@gmail.com";
		//if(true && true && true  )
		//if(true && true  )
		// if(true)
		if(email.indexOf("@") > 0 && email.contains("@") && email.endsWith(".com")  )
			System.out.println("valid emil");
		else
			System.out.println("invalid emil");
		
		
		String p="john";
		String q="John";
		if(p.equalsIgnoreCase(q))
			System.out.println("p and q are same");
		
		
		String h="john doe";
		h=h.replaceAll("o", "a");// string immmutable
		//h=jahn dae
		System.out.println(  h  );
		h=h.toUpperCase();
		System.out.println(  h  );
		
		
		
		
	}

}
