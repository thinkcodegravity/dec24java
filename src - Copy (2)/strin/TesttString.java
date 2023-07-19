package strin;

import methods.Person;

public class TesttString {

	public static void main(String[] args) {
		String s1="john"; // inside pool #aaa
		String s2=new String ("john");// outside pool #bbb
		String s3="john"; // inside pool #aaa
		String s4=new String ("john");// outside pool #ccc
		System.out.println( s1 );
		System.out.println( s2 );
		System.out.println( s3 );
		System.out.println( s4 );
		if(s1==s2)
			System.out.println("s1 and s2 are same");
		else
			System.out.println("s1 and s2 are different");
		
		if(s1==s3)
			System.out.println("s1 and s3 are same");
		else
			System.out.println("s1 and s3 are different");
	}
}
