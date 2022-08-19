package coll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import polymorphism.Car;
import polymorphism.Ford;
import polymorphism.FordMustang;
import polymorphism.FordSuperFast;

public class ListSample  {


	public static void main(String args[])
	{
		System.out.println("\n \n \n");
		// List has 3 types - arraylist,linkedlist and vector.
		//HashSet<String> studentsCollection=new HashSet<String> ();
		LinkedList<String> studentsCollection=new LinkedList<String> ();
		//Vector<String> studentsCollection=new Vector<String> ();
		
		// add items to list collection
		studentsCollection.add("ram");
		studentsCollection.add("shyam");
		studentsCollection.add("laxman");
		studentsCollection.add("laxman");
		
		// get size of list collection 
		int no_of_students=studentsCollection.size();
		System.out.println("List number of students:"+no_of_students);
		
		// get item from specific index ( not part of set collection )
		String firstStudent=studentsCollection.get(0);
		System.out.println("List first student:"+firstStudent);
		// ram, shyam, laxman, laxman
		// set item at specific index ( not part of set collection )
		studentsCollection.set(2, "bharat");
		// ram, shyam, bharat, laxman
		System.out.println(studentsCollection);
		
		studentsCollection.add(2, "john");
		// ram, shyam,john, bharat, laxman
		System.out.println(studentsCollection);
		// find the items index ( not part of set collection )
		int itemNo=studentsCollection.indexOf("jane");
		System.out.println("List find index of an item:"+itemNo);
		
		// ram, shyam,john, bharat, laxman
		// remove an item by index and by item
		studentsCollection.remove(0); // ( not part of set collection )
		// shyam,john, bharat, laxman
		studentsCollection.remove("john");
		// shyam,bharat, laxman
		
		// iterate items. Read items from the collection list
		Iterator<String> readStudentsCollection=studentsCollection.iterator();
		while(readStudentsCollection.hasNext())
		{
			String studentName=readStudentsCollection.next();
			System.out.println("List student name:"+studentName);
		}
		
		// studentsCollection=[shyam,bharat, laxman]
		
		// read purpose
		for(int i=0;i<studentsCollection.size();i++)
		{
			String names=studentsCollection.get(i);
			System.out.println("List student name:"+names);
		}
		// for-each ... enhanced for loop
		//LinkedList<String> studentsCollection=
		for(String s:studentsCollection) {
			System.out.println(s);
		}
		LinkedList<Integer> scores=new LinkedList<Integer>();
		scores.add(10); // primitive int value
		scores.add(new Integer(13));// object Integer value
		scores.add(50);
		// auto type casting
		for( int i  :  scores) {
			System.out.println(i);
		}
		LinkedList<Car> showroom=new LinkedList<Car>();
		Car c=new Car();
		Ford f=new Ford();
		FordMustang fm=new FordMustang();
		FordSuperFast fs=new FordSuperFast();
		
		showroom.add( c );
		showroom.add( f );// f = Ford... Ford IS-A Car = TRUE
		
		// Object - very first class/program in java
		// Parent of every java program ever writen or will be 
		// written in future
		
		LinkedList<Object> everything=new LinkedList<Object>();
		everything.add("john");// String is child of Object
		everything.add(12); // Integer is child of Object
		everything.add(true);
		everything.add(12.4);
		everything.add(f);
		everything.add(fs);
		
		
		
	}
}
