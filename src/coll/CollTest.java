package coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		// students is collection variable
		// group of String values
		LinkedList<String> students=new LinkedList<String>();
		students.add("john");
		students.add("jane");
		students.add("mike");
		students.add("jane");// list allows duplicate values
		System.out.println(students);
		students.add(1,"andy");
		System.out.println(students);
		System.out.println(students.get(3));
	}

}
