package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class TestCollection {
public static void main(String args[])
{
	HashMap<String, Integer> scores=new HashMap<String, Integer> ();
	scores.put("john", 45);
	scores.put("jane", 60);
	scores.put("mike", 55);
	scores.put("andy", 65);
	
	scores.remove("mike");
	System.out.println(scores);
	
	
	Student s1=new Student("john doe",1);
	Student s2=new Student("jane doe",1);
	Student s3=new Student("mike moe",2);
	Student s4=new Student("jane doe",1);
	
	TreeSet<Integer> sc=new TreeSet<Integer>();
	sc.add(12);
	sc.add(123);
	sc.add(546);
	sc.add(546);
	sc.add(456);
	System.out.println(sc);
	
	TreeSet<Student> hs=new TreeSet<Student>();
	hs.add(s1);
		// step 1... category of s1 ??? 1
		// step 2... hashCode can tell me that
		// HashSet will call hashCode of s1
		// to know the group/category of s1
	hs.add(s2);
	hs.add(s3);
	hs.add(s4);
	System.out.println(  hs.size()  );
	System.out.println(  hs );
}
}
