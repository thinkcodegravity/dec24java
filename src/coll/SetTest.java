package coll;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> studentsCollection=new TreeSet<String> ();
		studentsCollection.add("john");
		studentsCollection.add("jane");
		studentsCollection.add("mike");
		studentsCollection.add("andy");
		System.out.println(studentsCollection);

		// TreeSet and TreeMap are sorting collection
		TreeSet<Student> school=new TreeSet<Student> ();
		Student s1=new Student("john",1);
		Student s2=new Student("jane",1);
		Student s3=new Student("mike",1);
		school.add(s1);
		school.add(s2);
		school.add(s3);
		System.out.println(school);
	}

}
