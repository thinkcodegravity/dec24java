package coll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class HashSample {

	public  static void main(String args[])
	{
		System.out.println("\n \n \n");
		//LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String, String>();
		//HashMap<String, String> studentPercent =new HashMap<String, String>();
		//TreeMap<String, String> studentPercent =new TreeMap<String, String>();
		// wrapper classes... Object version of primitive data type.
		Hashtable<String, Integer> studentPercent =new Hashtable<String, Integer>();
		studentPercent.put("ram", 65);
		studentPercent.put("shyam", 23);
		studentPercent.put("bharat", 55);
		studentPercent.put("shyam", 45);
		
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
		Set<String> studentNameKey=studentPercent.keySet();
		{
			System.out.println("student scored 65");
		}
		studentPercent.valu
	for(String s:studentNameKey)
	{
		System.out.println("Key is:"+s);
		System.out.println("Value is:"+studentPercent.get(s));
	}
		
	}
}
