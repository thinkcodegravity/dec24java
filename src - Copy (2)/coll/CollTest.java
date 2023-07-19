package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollTest {

	
	public static void main(String[] args) {
		// collections dont work with primitive/simple data type
		// Wrapper data type = Object/complex version of
		// primitive data type
		// int=Integer, short=Short, byte=Byte, long=Long
		// float=Float, double=Double, boolean=Boolean
		// char=Character
		
		Vector<Float> scores=new Vector<Float>();
		scores.add(25.3f);
		// 3 popular type of List collection
		// vector = BETTER READING. synchronized ( Accurate BUT slow )
		// arraylist = BEST READING. not synchronized ( inaccurate BUT fastest )
		// linkedlist = BEST EDITING. ( bad reading )
		
		//Vector<String> names=new Vector<String> ();
		//ArrayList<String> names=new ArrayList<String> ();
		LinkedList<String> names=new LinkedList<String> ();
		
		names.add("john");// 0-john 
		names.add("jane");// 0-john,1-jane
		names.add("mike");// 0-john,1-jane,2-mike
		System.out.println(names);
		System.out.println(  names.get(1) );// jane
		names.remove("jane");// 0-john, 1-mike
		System.out.println(names);// 0-john, 1-mike
		System.out.println(  names.get(1) );// mike
		names.add(0,"andy");// 0-andy, 1-john, 2-mike
		System.out.println(names);// 0-andy, 1-john, 2-mike
		System.out.println(  names.get(1) );// john
		names.remove(0);// 0-john, 1-mike
		System.out.println(names);// 0-john, 1-mike
		System.out.println(  names.get(1) );// mike
		names.set(0,"andy");// 0-andy, 1-mike
		// add( index, value) // insertion, existing value
							// will move 1 index level down
		// set( index, value) // update
							// overwrite existing value
							// in the index
		System.out.println(names);// 0-andy, 1-mike
	
	}

}
