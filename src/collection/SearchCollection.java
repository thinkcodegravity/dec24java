package collection;

import java.util.*;

public class SearchCollection {

	public static void main(String[] args) {
		TreeSet<Student> school=new TreeSet<Student>();
		Student s1=new Student("john doe", 1);
		Student s2=new Student("jane doe", 1);
		Student s3=new Student("mike doe", 2);
		Student s4=new Student("john doe", 1);
		
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		
		// for-each
		for(Student items: school)
			System.out.println(items);
		
		
		int [] arr= { 12,23,45,66,11 };
		for(int items:arr)
			System.out.println(items);
		
		
		
		
		
	}

}
