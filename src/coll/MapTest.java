package coll;

import java.util.HashMap;
import java.util.HashSet;

import polymorphism.Car;

public class MapTest {

	Car c;	// null default value
	Integer i;// null default value
	int ii; // 0 default value
	public static void main(String[] args) {
		
		// Set is known for uniqueness
		// If Set is made of inbuilt program
		// uniqueness WORKS just like that
		HashSet<String> name=new HashSet<String>();
		name.add("john");
		name.add("jane");
		name.add("john");
		System.out.println( "names:"+name.size() );
		
		// If Set is made of user/progammer defined programs
		// additional code is required to ensure uniqueness in a set and map
		HashSet<Student> school=new HashSet<Student>();
		Student s1=new Student("john", 1);// 1
		Student s2=new Student("jane", 2);// 2
		Student s3=new Student("mike", 3);
		Student s4=new Student("john", 1);
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		System.out.println("school:"+ school.size() );
		
		
		
		HashMap<String, Integer> scores=new HashMap<String, Integer> ();
		scores.put("jane", 70);
		scores.put("mike", 60);
		
		// false = false 
		if(scores.containsKey("john") == false)
			scores.put("john", 80);
		
		System.out.println(scores);

	}

}
