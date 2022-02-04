package collections;

public class Student implements Comparable<Student> {
	int grade;
	String name;
	
	public Student(String n,int g)
	{
		this.name=n;
		this.grade=g;
	}
	
	// categorizing this object
	public int hashCode()
	{
		return this.grade;
	}
	
	// find duplicates 
	// is this object similar to another object
	public boolean equals(Object obj)
	{
		Student anotherObject=(Student) obj;
		if( this.grade== anotherObject.grade
				&&
			this.name.equals(anotherObject.name)
				)
			return true;
		else
			return false;
			
	
	}
	/*
	
	
	*/
	
	
	
public int compareTo(Student anotherObject)
{
	
	// this method has to return int value, which treeset uses to sort in ascending order.
	// if difference is higher, this student record moves to the bottom of treeset
	
	int difference= this.grade - anotherObject.grade;
	return difference;
	
	// String class already has it own way of comparing string values.
	// to compare by string value (this.name)
	// return this.name.compareTo(anotherObject.name);
	 
}

}
