package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="john";
		names[1]="jane";
		names[4]="andy";
		for(String s:names)
			System.out.println(s);
		
		// list is indexed and ordered and dynamic size
		LinkedList<String> nameColl=new LinkedList<String>();
		nameColl.add("john");
		nameColl.add("jane");
		nameColl.add("andy");
		nameColl.add("mike");
		System.out.println(nameColl);
		System.out.println( nameColl.indexOf("andy"));
		
		Collections.synchronizedList(nameColl);
		
		for(String s:nameColl)
			System.out.println(s);
		
		
		
		nameColl.remove("jane");
		System.out.println(nameColl);
		System.out.println( nameColl.indexOf("andy"));
		
		
		// HashSet : unique, unordred
		// LinkedHashSet : unqiue, ordered
		// TreeSet : unqiue, sorted
		System.out.println("***** set *****");
		HashSet<String>  nameSet=new HashSet<String>();
		nameSet.add("john");
		nameSet.add("jane");
		nameSet.add("mike");
		nameSet.add("john");
		System.out.println( nameSet );
		
		// wrapper class
		// collections operate only on object/complex data type... not on primitive 
		// int = Integer , float = Float , double=Double, boolean = Boolean, char=Character
		// short=Short, long=Long, byte=Byte
		ArrayList<Integer> scores=new ArrayList<Integer> ();
		scores.add(10);
		scores.add(20);
		scores.add(30);
		scores.add(22);
		
	}

}
