package collection;

public class Student implements Comparable<Student> {
	int grade;
	String fullName;
	public Student(String fn,int g) {
		grade=g;
		fullName=fn;
	}
	// categorization
	public int hashCode() {
		return grade;
	}
	// duplicate check
	public boolean equals(Object anotherObject) {
		Student anotherStuObject=(Student)anotherObject;
		if( this.grade == anotherStuObject.grade   
				&&
			this.fullName.equals(anotherStuObject.fullName)
				)
			return true;
		else
			return false;
			
	}
	public String toString() {
		return fullName +":"+grade;
	}
	
	public int compareTo(Student anotherObject)
	{	
		int difference= this.fullName.compareTo(anotherObject.fullName);
		return difference;
		 
	}
	
}








/*
  implements Comparable<Student> 
 
	int score;
	
	public Student(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	// comparison
	public boolean equals(Object obj)
	{
		return ((Student)obj).name.equalsIgnoreCase(this.name);
	}
	// categorizing
	public int hashCode()
	{
		return this.score;
	}
	
public int compareTo(Student anotherObject)
{
	
	// this method has to return int value, which treeset uses to sort in ascending order.
	// if difference is higher, this student record moves to the bottom of treeset
	
	int difference= this.score - anotherObject.score;
	return difference;
	
	// String class already has it own way of comparing string values.
	// to compare by string value (this.name)
	// return this.name.compareTo(anotherObject.name);
	 
}

}
*/