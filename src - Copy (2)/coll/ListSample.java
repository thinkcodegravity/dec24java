package coll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class ListSample {


	public static void main(String args[])
	{
	
		// array and collections = group of data type
		
		// wrapper data type - object data type WRAPPED on top of primitive data type
		// class/complex data type version of primitive
		// byte = Byte, short=Short,int=Integer, long=Long,
		// float = Float, double=Double, boolean = Booleam
		// char= Character
		int[] arr=new int[5];
		Student[] stu=new Student[5];

		String s;
		
		LinkedList<Integer> ww=new LinkedList<Integer>();
		
		ww.add(10);
		ww.add(20);
		ww.add(25);
		ArrayList<Student> aa=new ArrayList<Student>();
		
		
		
		ArrayList<Integer> score=new ArrayList<Integer>();
		score.add(10);
		score.add(20);
		score.add(50);
		score.add(30);
		
		
		
		
		
		System.out.println("\n \n \n");
		// List has 3 types - arraylist,linkedlist and vector.
		//ArrayList<String> studentsCollection=new ArrayList<String> ();
		//LinkedList<String> studentsCollection=new LinkedList<String> ();
		Vector<String> studentsCollection=new Vector<String> ();
		
		//HashSet<String> studentsCollection=new HashSet<String> ();
		//TreeSet<String> studentsCollection=new TreeSet<String> ();
		//LinkedHashSet<String> studentsCollection=new LinkedHashSet<String> ();
		
		// add items to list collection
		studentsCollection.add("ram"); // 0  ram
		studentsCollection.add("shyam");//1  ram,shyam
		studentsCollection.add("laxman");//2  ram,shyam,laxman
		studentsCollection.add("laxman"); //3  inserted the string name towards the end
											// ram,shyam,laxman,laxman
		studentsCollection.add(2,"tony");// ram, shyam, tony, laxman, laxman
		
		// get size of list collection 
		int no_of_students=studentsCollection.size();
		System.out.println("List number of students:"+no_of_students);
		
		// get item from specific index ( not part of set collection )
		String firstStudent=studentsCollection.get(0);
		System.out.println("List first student:"+firstStudent);
		
		// ram, shyam, bharat, laxman
		
		// set item at specific index ( not part of set collection )... UPDATE
		studentsCollection.set(2, "bharat"); // ram, shyam, tony, laxman, laxman
											//  ram, shyam, bharat, laxman, laxman
		

		// find the items index ( not part of set collection )
		int itemNo=studentsCollection.indexOf("bharat");
		System.out.println("List find index of an item:"+itemNo);
		
		// remove an item by index and by item
		studentsCollection.remove(0); // ram, shyam, bharat, laxman, laxman
									  // shyam, bharat, laxman, laxman
		
		studentsCollection.remove("bharat");//   shyam, bharat, laxman, laxman
									  	   //    shyam, laxman, laxman
		
		firstStudent=studentsCollection.get(0);
		
		// iterate items. Read items from the collection list
		Iterator<String> readStudentsCollection=studentsCollection.iterator();
		while(readStudentsCollection.hasNext())
		{
			String studentName=readStudentsCollection.next();
			System.out.println("List student name:"+studentName);
		}
		
		// john, jane,mike
		//  0,    1,  2
		// read purpose
		for(int i=0;i<studentsCollection.size();i++)
		{
			String names=studentsCollection.get(i);
			System.out.println("List student name:"+names);
		}
		// for-each.. enchanced for loop
		// studentsCollection = john, jane, mike,andy
		for(String ss:studentsCollection) {
			System.out.println(ss);
		}
	}
}
