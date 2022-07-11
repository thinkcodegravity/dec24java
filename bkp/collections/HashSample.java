package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashSample {

	public static void main(String argp[]) {
		int[] arr = new int[5];
		// Wrapper classes for each primitive data type
		// int =Integer, short=Short,byte=Byte,long=Long
		// float=Float, double=Double
		// char=Character
		// boolean=Boolean
		ArrayList<Integer> sco1 = new ArrayList<Integer>();
		HashSet<Float> sco2 = new HashSet<Float>();
		TreeMap<Character, String> sco3 = new TreeMap<Character, String>();

		System.out.println("\n \n \n");
		// LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String,
		// String>();
		// HashMap<String, String> studentPercent =new HashMap<String, String>();
		// TreeMap<String, String> studentPercent =new TreeMap<String, String>();
		Hashtable<String, String> studentPercent = new Hashtable<String, String>();
		studentPercent.put("ram", "65");
		studentPercent.put("shyam", "95");
		studentPercent.put("bharat", "35");
		studentPercent.put("shyam", "45");

		System.out.println(studentPercent);
		// get size of hash
		int studentSize = studentPercent.size();
		System.out.println("hash : number of students :" + studentSize);

		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize = studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :" + studentSize);
		System.out.println(studentPercent);
		// get value by key
		String percent = studentPercent.get("ram");
		System.out.println(percent);
		// check if key exists
		if (studentPercent.containsKey("ram")) {
			System.out.println("student ram exists");
		}

		// check if value exists
		if (studentPercent.contains("65")) {
			System.out.println("student scored 65");
		}

		// get all the keys from hashmap
		Set<String> studentNameKey = studentPercent.keySet();
		for (String s : studentNameKey) {
			System.out.println("Key is:" + s);
			System.out.println("Value is:" + studentPercent.get(s));
		}

		
		
		
	}
}
