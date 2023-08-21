package collection;

import java.util.*;

public class SetExample extends Object{

	public static void main(String[] args) {
		
		TreeSet<String> names=new TreeSet<String>();
		names.add("john");
		names.add("jane");
		names.add("john");
		names.add("mike");
		// 1)Unique 2) not-indexed
		System.out.println( names );

		
		// HashSet - unOrdered (Fastest) 
		// linkedhashset - ordered
		// TreeSet - Sorted ( alphabetical )
		
	}

}
