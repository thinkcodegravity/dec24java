package collection;

import java.util.ArrayList;

public class ColTest {

	public static void main(String[] args) {
		
		// List : duplicates , ordered , indexed
		
		// ArrayList
		ArrayList<String> names=new ArrayList<String>();
		names.add("john"); // index 0
		names.add("jane"); // index 1
		names.add("mike"); // index 2
		names.add("john"); // index 3
		// john , jane, mike , john
		System.out.println( names );
		System.out.println( names.get(2) ); // mike
		names.remove("jane");
		// john ,  mike , john 
		System.out.println( names );
		System.out.println( names.get(2) ); // john
		names.add(1,"ron");
		// john, ron, mike , john 
		System.out.println( names );
		System.out.println( names.get(2) ); // mike
		
		names.add(1,"tony");
		System.out.println( names.size() );
		
		for(String s: names) {
			System.out.println(s);
		}
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		
		
		
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(12);
		scores.add(345);
		
		ArrayList<Student> school=new ArrayList<Student>();
		
		
		Student a=new Student("john",1);
		int b=10;
		String c="john";
		String d="john first grade";
		
		names.add( c );
		scores.add( b );
		school.add( a );
		
		
	}

}
