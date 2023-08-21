package collection;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String> ();
		names.add("john");
		names.add("jane");
		names.remove("john");
		names.add(1,"mike");
		// jane and mike
		// regular for - initialization, condition check , modification
		// enhanced for loop ( for-each ) : data type and collection
		for(String s : names) {
			System.out.println( s );
		}
		
		
		HashSet<Integer> grade=new HashSet<Integer> ();
		grade.add(12);
		grade.add(10);
		grade.remove(10);
		for(Integer i : grade) {
			System.out.println( i );
		}
		
		HashMap<String, Integer> scores=new HashMap<String, Integer> ();
		scores.put( "john",  60 ); // [ john=60 ]
		scores.put( "jane",  70 ); // [ john=60 , jane=70 ]
		 // if duplicate key - overwrite previous value
		scores.put( "john",  50 ); // [ john=50 , jane=70 ]
		// remove key-value pair entry by KEY
		scores.remove("jane");  // [ john=50 ]
		scores.put( "mike",  80 ); // [ john=50 , mike=80 ]
		System.out.println( scores );
		System.out.println( scores.get("john") ); // read value for key
		System.out.println( scores.containsKey("jane") );
		System.out.println( scores.containsValue(80) );
		
		// scores = [ john=50 , mike=80 ]
		Set<String> allKeys=scores.keySet();
		// allkeys = john , mike
		for(String s : allKeys) {
			System.out.println( s ); // john, mike
			System.out.println(scores.get(s)); // 50, 80
		}
	}

}
