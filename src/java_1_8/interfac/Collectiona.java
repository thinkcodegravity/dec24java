package java_1_8.interfac;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Collectiona {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String> ();
		names.add("john");
		names.add("jane");
		names.add("mike");
		names.add("andy");
		
		for(int i=0;i<names.size();i++) {
			System.out.println( names.get(i) );
		}
		
		names.forEach(
				name -> System.out.println(name)
		);
		
		// stream api 
		//ArrayList<int> numbers=new ArrayList<int>();
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(3);numbers.add(6);numbers.add(7);numbers.add(4);
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i) % 2 == 0)
				System.out.println(numbers.get(i) );
		}
		
		Stream<Integer> sequentialStream = numbers.stream();
		Stream<Integer> evenNums = sequentialStream .filter(n -> n%2==0 ); //filter numbers greater than 90
		evenNums.forEach(p -> System.out.print(p+" "));

	}

}
