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
		HashMap<String, Integer> studentPercent =new HashMap<String, Integer>();
		studentPercent.put("ram", 65);
		studentPercent.put("shyam", 65);
		studentPercent.put("bharat", 65);
		studentPercent.put("shyam", 45);// new record is NOT created
										// however values are overwritten
		
		// get size of hash
		int studentSize=studentPercent.size(); // ram-65, shyam-45, bharat-65
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");// ram-65, shyam-45 
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		int percent=studentPercent.get("ram"); // ram-65, shyam-45
		
		// check if key exists 
		if(studentPercent.containsKey("ram"))
		{
			System.out.println("student ram exists");
		}

		// check if value exists 
		if(studentPercent.containsValue(65))
		{
			System.out.println("student scored 65");
		}
		
		// get all the keys from hashmap 
		Set<String> studentNameKey=studentPercent.keySet();
		{
			System.out.println("student scored 65");
		}
		 
	for(String s:studentNameKey)
	{
		System.out.println("Key is:"+s);
		System.out.println("Value is:"+studentPercent.get(s));
	}
		
	}
}
