package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class HashSample {

	public  static void main(String args[])
	{
		HashSet<String > s;
		// hashmap : unordered , linkedhashmap : ordered , treemap : sorted
		System.out.println("\n \n \n");
		//LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String, String>();
		//HashMap<String, String> studentPercent =new HashMap<String, String>();
		//TreeMap<String, String> studentPercent =new TreeMap<String, String>();
		int[] arr=new int[5];
		// wrapper classes... Object version of primitive data type.
		Hashtable<String, Integer> studentPercent =new Hashtable<String, Integer>();
		studentPercent.put("ram", 23);
		studentPercent.put("shyam", 23);
		studentPercent.put("bharat", 55);
		studentPercent.put("shyam", 45);
		System.out.println(studentPercent);
		// get size of hash
		int studentSize=studentPercent.size();
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		int percent=studentPercent.get("ram");
		
		// check if key exists 
		if(studentPercent.containsKey("ram"))
		{
			System.out.println("student ram exists");
		}

		// check if value exists 
		if(studentPercent.contains("65"))
		{
			System.out.println("student scored 65");
		}
		
		// get all the keys from hashmap 
		// shyam,ram
		Set<String> studentNameKey=studentPercent.keySet();
		for(String st:studentNameKey) {
			 System.out.println(st);
			 System.out.println(studentPercent.get(st));
		 }
		 
	 for(Map.Entry<String, Integer> stu:studentPercent.entrySet()) {
		 System.out.println(stu.getKey());
		 System.out.println(stu.getValue());
	 }
	 
		 
	 int[] scores= { 12,4,6,7 };
	 String[] names={ "john", "jane" };
	 
	 ArrayList<String> nameColl=new ArrayList<String>();
	 ArrayList<Integer> nameCol2=new ArrayList<Integer>();
	 nameCol2.add(12);
	 
	 // wrapper class
	 // int > Integer , byte > Byte, short > Short, long > Long
	 // float > Float , double > Double, char > Character
	 // boolean > Boolean
	 
	}
}
