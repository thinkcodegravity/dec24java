package collection;

import java.util.*;
public class ListCollTest {

	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		names.add("john");
		names.add("jane");
		names.add("john");
		names.add("mike");
		System.out.println( names );
		names.remove("mike");
		
		
		
		
		
		
		
		
		
		// john, jane , john, mike
		// 1) DUPLICATE, 2) ORDERED
		System.out.println( names );// john, jane , john, mike
		// 3) INDEXED
		System.out.println( names.get( 1));// jane
		// john, jane , john, mike
		names.remove("john"); // remove items from middle
		// jane , john, mike
		System.out.println( names.get( 1)); // john
		names.add(2,"ron"); // add items in middle (spcific position )
		// jane , john, ron, mike
		System.out.println(names);
		
	}

}
