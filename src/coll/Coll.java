package coll;

import java.util.HashSet;
import java.util.TreeSet;

public class Coll {

	public static void main(String[] args) {
		// collection of in-built / library datatype called integer
		// Integer : created by JDK founders
		// Integer uniquenes/duplicate check code will be provide by 
		//				JDK founders
		HashSet<Integer> scores=new HashSet<Integer>();
		scores.add( 20 );
		scores.add( 24);
		scores.add( 24);
		scores.add( 30);
		//System.out.println( scores.size() );
		
		// collection of user-defined or programmer-defined data type
		// Student : created by ME 
		// Student unique/duplicated check code will be provided by
		//			ME
		TreeSet<Student> school= new TreeSet<Student> ();
		// school.add("john");// school collection of student data type
							// error : try to add String data type
		Student s1=new Student("john doe",1);
		Student s2=new Student("jane doe",1);
		Student s3=new Student("mike moe",2);
		Student s4=new Student("andy doe",3);
		Student s5=new Student("jane doe",1);
		
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		school.add(s5);
		System.out.println( school  );
		
		
		
		
	}

}
