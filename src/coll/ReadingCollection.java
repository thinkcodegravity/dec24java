package coll;

import java.util.*;

public class ReadingCollection {

	public static void main(String[] args) {
		ArrayList<String> listExample =new ArrayList<String> ();
			listExample.add("john");
			listExample.add("jane");
			listExample.add("john");
		HashSet<String> setExample =new HashSet<String> ();
			setExample .add("mike");
			setExample .add("andy");
			setExample .add("andy");
		HashMap<String,Integer> mapExample =new HashMap<String,Integer> ();
			mapExample.put("john",50);
			mapExample.put("jane",70);
			mapExample.put("john",60);
			
		// reading collection with for-each.... enhanced-for loop	
		for( String s:listExample  ) {
			System.out.println(s);
		}
		for( String s:setExample  ) {
			System.out.println(s);
		}
		System.out.println("***************");
		Set<String> allKeyInMap=mapExample.keySet();
		for( String s:allKeyInMap  ) {
			System.out.println(s);
			System.out.println(mapExample.get(s));
			
		}
		
	}

}
