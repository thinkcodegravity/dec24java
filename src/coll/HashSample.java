package coll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class HashSample {

	public  static void main(String args[])
	{
		// HashSet : unique and unordered
		// LinkedHashSet : unique and ordered
		// TreeSet : unqiue and sorted
		
		// school : collection of String (String - inbuilt library data type)
						// inbuilt program - also include uniqueness check code
		// university : collection of Student(Student - user defined/written data type)
						// user defined program - programmers responsibbility
						//							to write the uniqueness check code
		HashSet<String> school=new HashSet<String> ();
		//school.add(1);
		school.add("jane");
		school.add("mike");
		school.add("john");
		school.add("jane");
		System.out.println(school);
	
		TreeSet<Student> university=new TreeSet<Student> ();
		String a="john";
		int b=10;
		Student c=new Student("jane doe",1);
		Student d=new Student("john doe",2);
		Student f=new Student("mike moe",4);
		Student g=new Student("andy a",1);
		university.add( c );
		university.add( d );
		university.add( f );		
		university.add( g );		
		System.out.println( university  );
		
		
	}
}
