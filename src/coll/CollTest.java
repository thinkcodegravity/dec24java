package coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String> ();
		//names.add(10);
		names.add("john");
		names.add("jane");
		names.add("john");// duplicate ignored
		names.add("jane");// duplicate ignored
		names.add("mike");
		System.out.println(names.size());
		System.out.println(names);
		
		HashSet<Student> school=new HashSet<Student> ();
		String a="jane";
		Student s1=new Student("john",1,123);
		Student s2=new Student("jane",1,222);
		Student s3=new Student("mike",2,333);
		Student s4=new Student("john",1,456);
		Student s5=new Student("jane",1,223);
		//school.add(a); // school is collection of student data type...
						// adding string will give error
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		school.add(s5);
		System.out.println("student collection : "+school.size());
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("john");
		ts.add("andy");
		ts.add("mike");
		System.out.println(ts);
		
		TreeSet<Student> tss=new TreeSet<Student>();
		tss.add(s1);
		tss.add(s2);
		tss.add(s3);
		tss.add(s4);
		tss.add(s5);
		System.out.println(tss);
	}

}
