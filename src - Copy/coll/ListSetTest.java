package coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

import ExcpHand.Student;

public class ListSetTest {
	int a=12;
	String b;
	Student s;
	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="john";
		names[1]="jane";
		names[2]="john";
		names[3]="john";
		names[4]="john";
		
		LinkedList<String> namesList=new LinkedList<String>();
		namesList.add("jane");
		namesList.add("john");
		namesList.add("jane");
		namesList.add("mike");
		namesList.add("tony");
		// jane, john, jane, mike, tony
		System.out.println( namesList );
		namesList.add(2,"ron");
		// jane, john, ron,	 jane, mike, tony
		System.out.println( namesList );
		// list are indexed and can contain duplicates
		System.out.println( namesList.get(4) );
		namesList.remove("john");
		System.out.println( namesList );
		
		
		HashSet<String> namesSet=new HashSet<String>();
		namesSet.add("jane");
		namesSet.add("john");
		namesSet.add("jane");
		namesSet.add("mike");
		namesSet.add("andy");
		namesSet.add("ron");
		namesSet.add("tony");
		namesSet.add("mon");
		
		System.out.println(namesSet);
		// sets are not indexed and is unique
		//System.out.println(namesSet.get(2));
		
		int[] sc=new int[5];// primitive and object data type
		String[] s=new String[5];// primitive and object data type
		
		// wrapper classes
		// int=Integer , float=Float, long=Long, short=Short
		// byte=Byte, double=Double, boolean=Boolean
		// char=Character
		//ArrayList<int> b=new ArrayList<int>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(10);
		b.add(12);
		b.add(15);
		ArrayList<Double> c=new ArrayList<Double>();
		c.add(12.1);
		c.add(34.1);
		
		ArrayList<String> d=new ArrayList<String>();
		Integer aa=new Integer(12);
		Integer bb=new Integer(10);
		
		int aaa=12;
		int bbb=10;
		
		System.out.println( aa+bb );
		
		System.out.println( aaa+bbb );
		Student[] schoolArr=new Student[5];
		schoolArr[0]=new Student();
		schoolArr[1]=new Student();
		schoolArr[2]=new Student();
		
		ArrayList<Student> school=new ArrayList<Student> ();
		// school.add("john"); school is a group of student data type
		// cannot add string value.
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		String s4=new String("john 1st grade");
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(schoolArr[0]);
		school.add(schoolArr[1]);
		
		//school.add(s4);
		
		
		
		
		
	}

}
