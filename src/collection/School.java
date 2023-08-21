package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class School {

	public static void main(String[] args) {
		
// Primitive and Object data type
// Array support both
		int[] abc=new int[5];
		String[] pqr=new String[5];
// collection support only Object
		// hence all primitive data types have WRapper class
		// Wrapper object
		// int = Integer , long = Long, byte=Byte, short=Short
		// float = Float, double=Double, boolean=Boolean
		// char=Character
		
		HashSet<Boolean> aaa=new HashSet<Boolean> ();
		aaa.add(true);
		
		
		// scores collection of integer - Add integer
		HashSet<Integer> scores=new HashSet<Integer> ();
		  scores.add(12);
		// names collection of String - Add String
		HashSet<String> names=new HashSet<String> ();
		  names.add("john");  
		
		// school collection of Student - Add Student
		TreeSet<Student> school=new TreeSet<Student> ();
		 // cannot add string value for Student collection
		 //school.add("john");
		Student s1=new Student("john",1);
		Student s2=new Student("jane",2);
		Student s3=new Student("mike",1);
		Student s4=new Student("john",1);
		
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		System.out.println(school.size());
		System.out.println(school);
		
		 
	}

}
