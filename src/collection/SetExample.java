package collection;

import java.util.*;

public class SetExample extends Object{

	public static void main(String[] args) {
		// Set - unique , not indexed
		// Hashset - unordered
		// LinkedHashSet - ordered
		// TreeSet - sorted
		HashSet<String> names=new HashSet<String>();
		names.add("john");
		names.add("jane");
		names.add("john");
		names.add("mike");
		System.out.println(names.size());
		
		
		TreeSet<Student> school=new TreeSet<Student>();
		int a=10;
		String b="john";
			Student s1=new Student("john doe",1);
			Student s2=new Student("jane doe",2);
			Student s3=new Student("zack aa",3);
			Student s4=new Student("mike moe",4);
			Student s5=new Student("john doe",1);
		
		school.add( s1 );
		school.add( s2 );
		school.add( s3 );
		school.add( s4 );
		school.add( s5 );
		System.out.println(school );
		
		
		
		
		
		
		// 1)Unique 2) not-indexed
		System.out.println( names );

		names.remove("john");
		System.out.println( names );

		
		// HashSet - unOrdered (Fastest) 
		// linkedhashset - ordered
		// TreeSet - Sorted ( alphabetical )
		
	}

}
