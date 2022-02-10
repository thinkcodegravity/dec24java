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
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + "]";
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
	
public int compareTo(Student anotherObject)
{
	return this.name.compareTo(anotherObject.name);
	//int difference= this.grade - anotherObject.grade;
	//return difference; 
}

}
